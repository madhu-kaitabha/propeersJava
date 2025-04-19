package objectOrientedProgaming.exceptionHandling;

class CustomExcep{
    public void display() throws ClassNotFoundException {
    Class.forName("ThrowsKeywordDemo"); // works

//        try {
//            Class.forName("objectOrientedProgaming.exceptionHandling.ThrowsKeywordDemo"); // works
//        }catch (ClassNotFoundException e){
//            System.out.println("Not able to find class with name ThrowsKeywordDemo "+e);
//        }
    }
}

public class ThrowsKeywordDemo {
    static {
        System.out.println("ThrowsKeywordDemo class loaded");
    }
    public static void main(String[] args) throws ClassNotFoundException { // never use throws with main method. use try and catch in main
        CustomExcep obj = new CustomExcep();
        obj.display(); // use try catch here. never use throws with main method.
        }
}
