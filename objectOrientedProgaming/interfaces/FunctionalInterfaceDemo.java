package objectOrientedProgaming.interfaces;

@FunctionalInterface
interface FA
{
    void show();
}

// class can implement functional interface
class FClass implements FA {

    @Override
    public void show() {
        System.out.println("In FClass show");
    }
}

// functional Interface for lambda expression
@FunctionalInterface
interface LFA{
    void render(int a, int b);
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        FA obj = new FClass();
        obj.show();
        FA obj2 = new FA(){
            @Override
            public void show() {
                System.out.println("In show method of anon class which implements FA interface");
            }
        };
        obj2.show();

        LFA obj3 = (i, j) -> System.out.println("sum: "+(i+j));
        obj3.render(5,4);
    }
}
