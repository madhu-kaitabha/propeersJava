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

        Calc cal2 = new AdvCalc();
        int a1 = cal2.add(1, 2);
        int b2 = cal2.subtract(2,3,5);

        // down casting cal2 obj to AdvCalc. if its not downcasted multiply and div cant be used
        AdvCalc cal3 = (AdvCalc) cal2;

        double c2 = cal3.multiply(1.5, 2);
        int d2 = cal3.div(1, 2);
    }
}
