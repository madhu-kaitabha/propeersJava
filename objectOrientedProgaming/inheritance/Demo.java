package objectOrientedProgaming.inheritance;

public class Demo {

    public static void main(String[] args) {
        AdvCalc cal = new AdvCalc();
        int a = cal.add(1, 2);
        int b = cal.subtract(2,3,5);
        double c = cal.multiply(1.5, 2);
        int d = cal.div(1, 2);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
