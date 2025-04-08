package objectOrientedProgaming.abstractClass;

abstract class Car{
    // An abstract class can have only abstract methods which are methods without definition.
    // Just declared methods with abstract keyword
    // An abstract class can have only normal implemented methods. these methods should not have abstract keyword in method signature
    // An abstract class can have both abstract and non-abstract methods
    // its compulsory to define all abstract methods in the subclass(or child class)
    abstract public void driveForward();

    public void playMusic(){
        System.out.println("Playing rock music\nEnjoy!!!");
    }
}

class Bmw extends Car{

    public void driveForward() {
        System.out.println("Driving...swwwyyyy!!!");
    }
}


public class AbstractClassDemo {

    public static void main(String[] args) {
        // Abstract class can only have reference.
        // Abstract class cannot have an object
        // Car newCar = new Car(); will give compilation error
        Car bmwCar = new Bmw();
        bmwCar.driveForward();
        bmwCar.playMusic();

    }

}
