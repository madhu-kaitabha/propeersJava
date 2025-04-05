package objectOrientedProgaming;

public class Mobile{

    String brand;
    int price;
    // static variable belongs to class. Not to the object instance.
    static String name;

    static {
        name = "Smart phone";
        System.out.println("inside static block");

    }

    public Mobile(){
        brand = "";
        price = 200;
        System.out.println("inside constructor method");
    }

    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }

    // only static variable can be accesses directly in static method
    // static methods dont allow usage of instance variables.
    // in order to use instead variable object instance is needed.
    // so object is pass as argument to the static method
    public static void show1(Mobile obj){
            System.out.println("inside static method");
            System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }
}
