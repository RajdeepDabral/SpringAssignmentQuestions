package dabral.rajdeep.springQuestions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
/*
3. Use @Compenent and @Autowired annotations to in Loosely
   Coupled code for dependency management
 */

interface Bank{
    public void rateOfInterest();
}

class BOB implements Bank{
    @Override
    public void rateOfInterest() {
        System.out.println("BOB rateOfInterest : "+9+"%");
    }
}
@Component
class ICICI implements Bank{
    @Override
    public void rateOfInterest() {
        System.out.println("ICICI rateOfInterest : "+7+"%");
    }
}
class SBI implements Bank{
    @Override
    public void rateOfInterest() {
        System.out.println("SBI rateOfInterest : "+10+"%");
    }
}

@Component
class Persons{
    @Autowired
    private Bank account;
    public void checkRateOfInterest(){
        account.rateOfInterest();
    }
}

@SpringBootApplication
public class Question3 {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                SpringApplication.run(Question3.class, args);
        Persons rajdeep = applicationContext.getBean(Persons.class);
        System.out.println("!!!!!!!!!!!!!!!!!Bank RateOfInterest!!!!!!!!!!!!!!!!!");
        rajdeep.checkRateOfInterest();
    }
}
