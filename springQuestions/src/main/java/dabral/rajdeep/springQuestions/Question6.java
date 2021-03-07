package dabral.rajdeep.springQuestions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/*
Q6. Perform Constructor Injection in a Spring Bean

*/

@Component
class Heart{
    private int noOfHeart;

    public Heart(@Value("1") int noOfHeart) {
        this.noOfHeart = noOfHeart;
    }
    public int getNoOfHeart() {
        return noOfHeart;
    }
}

@Component
class Human{
    private Heart heart;

    @Autowired
    public Human(Heart heart) {
        this.heart = heart;
    }
    public void working(){
        System.out.println("\nYour Heart Is Working !!!"+" with total noOfHeart :"+this.heart.getNoOfHeart());
    }
}


@SpringBootApplication
class Question6 {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                SpringApplication.run(Question6.class, args);
        Human obj = applicationContext.getBean(Human.class );
        obj.working();
    }
}