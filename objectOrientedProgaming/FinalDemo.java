package objectOrientedProgaming;

// final key word can be used on Variables, methods, classes
final class A { }
class B
{
    public final void show(){
        System.out.println("By Madhu");
    }
}

//class C extends A {  } // throws an error "cannot inherit from a final class"

class D extends B
{
   // public void show(){} // throws an error saying final method cannot be overridden
}

public class FinalDemo {

  public static void main(String[] args){

      final int num = 8;
      System.out.println(num);
  //    num = 9; // throws an error "cannot re-assign value ot final variable"
  }
}
