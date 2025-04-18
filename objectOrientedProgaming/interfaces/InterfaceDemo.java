package objectOrientedProgaming.interfaces;

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
