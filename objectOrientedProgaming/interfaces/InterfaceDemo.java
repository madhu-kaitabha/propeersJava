package objectOrientedProgaming.interfaces;

//https://www.geeksforgeeks.org/interfaces-in-java/
interface Employee {
    // all Variables in an interface are implicitly public, static, and final.
    // so we have to assign value while declaring itself.
    // values cant be changed anywhere in child implementation or through object as they are final
    int salary = 5000;
    String department = "Engineering";

    // interfaces can have abstract method without body.
    // Methods declared in an interface are, by default, marked as public and abstract
    void work();

    // in an Interface static methods can have bodies
    static void takeLeave(){
        System.out.println("On leave. in static method takeLeave");
    }

    default void givePresentation(){
        System.out.println("giving presentation..");
    }

    //We can’t create an instance (interface can’t be instantiated) of the interface but we can make the reference of it that refers to the Object of its implementing class.
    //A class can implement more than one interface.
    //An interface can extend to another interface or interface (more than one interface).
    //A class that implements the interface must implement all the methods in the interface.
    //All the methods are public and abstract. All the fields are public, static, and final.
    //It is used to achieve multiple inheritances.
    //It is used to achieve loose coupling.
    //Inside the Interface not possible to declare instance variables because by default variables are public static final.
    //Inside the Interface, constructors are not allowed.
    //Inside the interface main method is not allowed.
    //Inside the interface, static, final, and private methods declaration are not possible.

}

class LevelOneEmp implements Employee{

    public void work() {
        System.out.println("doing level one work");

    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Employee obj;
        obj = new LevelOneEmp();
        obj.work();
        obj.givePresentation();
        Employee.takeLeave();
    }
}
