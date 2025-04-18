package objectOrientedProgaming.interfaces;

interface Add{
    int add(int a,int b);
}

interface Sub{
    int sub(int a,int b);
}

class Cal implements Add, Sub{
    // Method to add two numbers
    public int add(int a,int b){
        return a+b;
    }

    // Method to sub two numbers
    public int sub(int a,int b){
        return a-b;
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        // instance of Cal class
        Cal x = new Cal();

        System.out.println("Addition : " + x.add(2,1));
        System.out.println("Subtraction : " + x.sub(2,1));

    }
}
