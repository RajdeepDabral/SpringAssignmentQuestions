package dabral.rajdeep.springQuestions;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
/*
4. Get a Spring Bean from application context and display its properties.
 */

@Component
class Robot{
    private int battery;
    public Robot(){
        battery=100;
    }
    public void move(){
        System.out.println("robot start moving!!!!!");
        battery -= 5;
    }
    public void charge(){
        System.out.println("Charging started!!!!");
        battery=100;
        System.out.println("Full Charged!!!!");
    }
    public String getBatteryPercentage(){
        return this.battery+"%";
    }
}

@SpringBootApplication
public class Question4 {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                SpringApplication.run(Question4.class, args);
        Robot r1 = applicationContext.getBean(Robot.class);
        r1.move();
        r1.move();
        r1.move();
        r1.move();
        System.out.println("Robot battery status : "+r1.getBatteryPercentage());
        r1.move();
        r1.charge();
        System.out.println("Robot battery status : "+r1.getBatteryPercentage());
    }
}
