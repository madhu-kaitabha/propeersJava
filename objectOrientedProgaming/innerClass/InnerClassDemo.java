package objectOrientedProgaming.innerClass;

// if a class is dependent on only A then we can define a class inside B class.
class A
{
    int age;

    public void show(){
        System.out.println("In show method");
    }

    class B
    {
        public void config(){
            System.out.println("In config method");
        }
    }

    // an inner class can be static
    static class C
    {
        public void display(){
            System.out.println("in display method");
        }
    }
}


public class InnerClassDemo {

    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        // in order to create an object of inner class we need outer class object.
        A.B obj1 = obj.new B();
        obj1.config();

        // in order to create an object a static inner class we don't need outer class object
        A.C obj2 = new A.C();
        obj2.display();

    }
}
