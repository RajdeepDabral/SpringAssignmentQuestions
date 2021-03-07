package dabral.rajdeep.springQuestions;
/*
1.  Write a program to demonstrate Tightly Coupled code.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

class Person {
	private Bike vehicle1 = new Bike();
	private Car vehicle2 = new Car();
	private Metro vehicle3 =  new Metro();

	public void travel(){
		System.out.println("Travel start!!!");
		vehicle1.drive();
		vehicle2.drive();
		vehicle3.drive();
		System.out.println("Travel End!!!!");
	}
}

class Bike{
	public void drive(){
		System.out.println("Bike start !!!");
		System.out.println("Bike end !!!");
	}
}
class Car{
	public void drive(){
		System.out.println("Car start !!!");
		System.out.println("Car end !!!");
	}
}
class Metro{
	public void drive(){
		System.out.println("Metro start !!!");
		System.out.println("Metro end !!!");
	}
}

//@SpringBootApplication
public class question1 {

	public static void main(String[] args) {
		//SpringApplication.run(question1.class, args);
		Person rajdeep = new Person();
		rajdeep.travel();
	}
}
