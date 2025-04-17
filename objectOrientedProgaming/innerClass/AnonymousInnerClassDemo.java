package objectOrientedProgaming.innerClass;

class A1{

    public void show(){
        System.out.println("in class A1 show method");
    }
}

public class AnonymousInnerClassDemo
{
    public static void main(String[] args){
        A1 obj = new A1(){
            public void show(){
                System.out.println("in show method of Anonymous clas");
            }
        };
        obj.show();
    }
}
