package objectOrientedProgaming;

class Calculator{
    public int add(int a, int b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
    public double add(double a, int b){
        return a+b;
    }
}

public class MethodOverloading {

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int a = cal.add(1, 2);
        int b = cal.add(2,3,5);
        double c = cal.add(1.5, 2);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
