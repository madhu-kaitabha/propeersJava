package objectOrientedProgaming.abstractClass;

abstract class AOne{
    abstract public void showOne();
}
public class AnonInnerClassForAbstractClass {
    public static void main(String[] args){
        AOne obj = new AOne() { // anonymous innerclass for an Abstract class
            @Override
            public void showOne() {
                System.out.println("In anon implementation of showOne");
            }

        };
        obj.showOne();
    }
}
