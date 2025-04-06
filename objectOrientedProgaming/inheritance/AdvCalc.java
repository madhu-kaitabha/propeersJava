package objectOrientedProgaming.inheritance;

// extends makes AdvCalc child class of Calc class
public class AdvCalc  extends Calc{

    public int multiply(int a, int b){
        return a*b;
    }
    public int multiply(int a, int b, int c){
        return a*b*c;
    }
    public double multiply(double a, int b){
        return a*b;
    }

    public int div(int a, int b){
        return a/b;
    }
}
