package objectOrientedProgaming.exceptionHandling;

public class ThrowKeywordDemo {

    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try {
            j = 18/i;
            if(j == 0)
                throw new ArithmeticException("I dont want to print zero");

        }catch (ArithmeticException ae){
            System.out.println("division gave quoeint of zero. "+ ae);
        }catch (Exception e){
            System.out.println("Something went wrong. "+e);
        }
    }
}
