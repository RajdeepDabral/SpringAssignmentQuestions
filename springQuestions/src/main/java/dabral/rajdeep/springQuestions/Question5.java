package dabral.rajdeep.springQuestions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
/*
5. Demonstrate how you will resolve ambiguity while
    autowiring bean (Hint : @Primary)
 */
interface Bank1{
    public void rateOfInterest();
}
@Component
class BOB1 implements Bank1{
    @Override
    public void rateOfInterest() {
        System.out.println("BOB rateOfInterest : "+9+"%");
    }
}
@Component
class ICICI1 implements Bank1{
    @Override
    public void rateOfInterest() {
        System.out.println("ICICI rateOfInterest : "+7+"%");
    }
}
@Component
@Primary
class SBI1 implements Bank1{
    @Override
    public void rateOfInterest() {
        System.out.println("SBI rateOfInterest : "+10+"%");
    }
}

@Component
class Person2{
    @Autowired
    private Bank1 account;

    public void checkRateOfInterest(){
        account.rateOfInterest();
    }
}

@SpringBootApplication
public class Question5 {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                SpringApplication.run(Question5.class, args);
        Person2 suraj = applicationContext.getBean(Person2.class);
        System.out.println("!!!!!!!!!!!!!!!!!Bank RateOfInterest!!!!!!!!!!!!!!!!!");
        suraj.checkRateOfInterest();
    }
}
