package threads;

//https://www.geeksforgeeks.org/multithreading-in-java/

class A extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.print("hi ");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class B extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.print("hello ");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


public class ThreadClassDemo {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        System.out.println(obj1.getPriority()); // 0 is low priority, 10 is high priority, 5 is normal priority
        System.out.println(obj2.getPriority());

        obj2.setPriority(Thread.MAX_PRIORITY);
        obj1.setPriority(Thread.MAX_PRIORITY);

        obj1.start(); // start method will execute the run method
        obj2.start();
    }
}


