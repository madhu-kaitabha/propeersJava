package objectOrientedProgaming.enums;

// enums are also class but a special type of class which holds constants
// constants in enums are objects of the enum class
//
enum Status{
    Running, Failed, Pending, Success
}

enum Laptop{
    Macbook(2000), Xps(2200), Surface, Thinkpad(1400);

    private int price;

    Laptop(){
        this.price = 500;
    }

    // parameterised constructor
    Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class EnumsDemo {
    public static void main(String[] args) {
        Status s  = Status.Success;
        System.out.println(s);
        Status f = Status.Failed;
        System.out.println(f.ordinal());

        System.out.println(s.getClass().getSuperclass());

        //Laptop lap = Laptop.Macbook;
        //System.out.println(lap.name()+" : "+lap.getPrice());

        for (Laptop l : Laptop.values()){
            System.out.println(l.name()+" : "+l.getPrice());
        }

    }
}

//The first line inside the enum should be a list of constants and then other things like methods, variables, and constructors.
//According to Java naming conventions, it is recommended that we name constant with all capital letters

//https://www.geeksforgeeks.org/enum-in-java/#
//There are certain properties followed by Enum as mentioned below:
//
//Class Type: Every enum is internally implemented using the Class type.
//Enum Constants: Each enum constant represents an object of type enum.
//Switch Statements: Enum types can be used in switch statements.
//Implicit Modifiers: Every enum constant is implicitly public static final. Since it is static, it can be accessed using the enum name. Since it is final, enums cannot be extended.
//Main Method: Enums can declare a main() method, allowing direct invocation from the command line.


//Enum and Inheritance
//All enums implicitly extend java.lang.Enum class. As a class can only extend one parent in Java, an enum cannot extend anything else.
//toString() method is overridden in java.lang.Enum class, which returns enum constant name.
//enum can implement many interfaces.

//Enum and Constructor
//Enums can contain constructors, which are called separately for each enum constant at the time of enum class loading.
//We can’t create enum objects explicitly and hence we can’t invoke the enum constructor directly.

//Enum and Methods
//Enums can have both concrete and abstract methods. If an enum class has an abstract method, each enum constant must implement it.