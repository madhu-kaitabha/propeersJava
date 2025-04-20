package threads;

//https://www.geeksforgeeks.org/java-threads/
// Runnable is a Functional Interface
//class Acounter implements Runnable{
//    public void run(){
//        for (int i = 0; i < 10; i++) {
//            System.out.print("hi ");
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}
//
//class Bcounter implements Runnable{
//    public void run(){
//        for (int i = 0; i < 10; i++) {
//            System.out.print("hello ");
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}

public class RunnableDemo {
    public static void main(String[] args) {
//        Runnable obj1 = new Acounter();
//        Runnable obj2 = new Bcounter();

        Runnable obj1 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.print("hi ");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
             }
        };

        Runnable obj2 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.print("hello ");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}


// We need to extend a Thread class. Because it is a class. It means we can not add any other class if we extend it. this creates issue with inheritance
// So we use Runnable Interface with implements keyword.
// Since interface allow multiple inheritance there is will be no issue in designing. It allows us to use other classes as well.
//

