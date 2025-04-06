package objectOrientedProgaming.inheritance;

class A{
    A(){
        System.out.println("In A's default constructor");
    }

    A(int a){
        System.out.println("In A's parameterised constructor");

    }

    public int add(int a, int b){
        return a+b;
    }

}

class B extends A{
    // if a child class constructor is called then parent's default constructor is also called with super()
    // super() method is present as first line of every constructor under the hood.
    // super() means call the constructor of parent class. super(parameter) indicates a parameterised parent class constructor
    // therefore here first A's constructor is called and later B's constructor is called
    B(){
        super(5);
        System.out.println("In B's default constructor");
    }

    B(int a){
        this();
        System.out.println("In B's parameterised constructor");
    }

    // overrides method in class A
    public int add(int a, int b){
        return a+b+1;
    }

}

public class ThisAndSuper {
    public static void main(String[] args) {
        B obj = new B(10);
        System.out.println(obj.add(3,5));
    }

}
