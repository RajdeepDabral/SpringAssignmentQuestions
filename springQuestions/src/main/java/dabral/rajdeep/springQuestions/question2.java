package dabral.rajdeep.springQuestions;
/*
2. Write a program to demonstrate Loosely Coupled code.
 */

interface Vehicle{
    public void drive();
}

class Car1 implements Vehicle{
    @Override
    public void drive() {
        System.out.println("Car1 start !!!");
        System.out.println("Car1 end !!!");
    }
}
class Bike1 implements Vehicle{
    @Override
    public void drive() {
        System.out.println("Bike1 start !!!");
        System.out.println("Bike1 end !!!");
    }
}
class Metro1 implements Vehicle{
    @Override
    public void drive() {
        System.out.println("Metro1 start !!!");
        System.out.println("Metro1 end !!!");
    }
}
class Bus1 implements Vehicle{
    @Override
    public void drive() {
        System.out.println("Bus1 start !!!");
        System.out.println("Bus1 end !!!");
    }
}

class Student{
    private Vehicle vehicle;
    public Student(Vehicle vehicle){
        this.vehicle = vehicle;
    }
    public void travel(){
        System.out.println("Travel start!!!");
        vehicle.drive();
        System.out.println("Travel End!!!!");
    }
}
public class question2 {
    public static void main(String[] args) {
        Student rajdeepDabral = new Student(new Bus1());
        rajdeepDabral.travel();
    }
}