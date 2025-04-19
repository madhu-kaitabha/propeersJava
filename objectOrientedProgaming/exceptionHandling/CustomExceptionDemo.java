package objectOrientedProgaming.exceptionHandling;

// in order to have custom exception class it needs to extend either Exception class or RuntimeException class

class MyOwnException extends Exception {
    // can give a string parameter if you want to print a message
    public MyOwnException(String s){
        super(s);
    }
}


public class CustomExceptionDemo {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try {
            j = 18/i;
            if(j == 0)
                throw new MyOwnException("I dont want to print zero");

        }catch (MyOwnException myE){
            System.out.println("division gave quoeint of zero. "+ myE);
        }catch (Exception e){
            System.out.println("Something went wrong. "+e);
        }
    }
}
