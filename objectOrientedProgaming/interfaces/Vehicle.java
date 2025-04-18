package objectOrientedProgaming.interfaces;

public interface Vehicle {
    // Abstract methods defined
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
    // Private method for internal use
    private void startEngine() {
        System.out.println("Engine started.");
    }
    // Default method that uses the private method
    default void drive() {
        // Calls the private method
        startEngine();
        System.out.println("Vehicle is now driving.");
    }
}

class Bicycle implements Vehicle{
    int speed;
    int gear;
    // Change gear
    @Override
    public void changeGear(int newGear){
        gear = newGear;
    }

    // Increase speed
    @Override
    public void speedUp(int increment){
        speed = speed + increment;
    }

    // Decrease speed
    @Override
    public void applyBrakes(int decrement){
        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("speed: " + speed
                + " gear: " + gear);
    }

}

// Class implementing vehicle interface
class Bike implements Vehicle {

    int speed;
    int gear;

    // Change gear
    @Override
    public void changeGear(int newGear){
        gear = newGear;
    }

    // Increase speed
    @Override
    public void speedUp(int increment){
        speed = speed + increment;
    }

    // Decrease speed
    @Override
    public void applyBrakes(int decrement){
        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("speed: " + speed
                + " gear: " + gear);
    }

}

class Car implements Vehicle {
    @Override
    public void changeGear(int a) {

    }

    @Override
    public void speedUp(int a) {

    }

    @Override
    public void applyBrakes(int a) {

    }
    // Car class implements Vehicle interface and inherits the default method 'drive'
}

class Main
{
    public static void main (String[] args)
    {

        // Instance of Bicycle(Object)
        Bicycle bicycle = new Bicycle();

        bicycle.changeGear(2);
        bicycle.speedUp(3);
        bicycle.applyBrakes(1);

        System.out.print("Bicycle present state : ");
        bicycle.printStates();

        // Instance of Bike (Object)
        Bike bike = new Bike();
        bike.changeGear(1);
        bike.speedUp(4);
        bike.applyBrakes(3);

        System.out.print("Bike present state : ");
        bike.printStates();

        Car car = new Car();
        // This will call the default method, which in turn calls the private method
        car.drive();
    }
}
