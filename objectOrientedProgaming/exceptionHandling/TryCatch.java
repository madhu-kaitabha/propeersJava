package objectOrientedProgaming.exceptionHandling;

public class TryCatch {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int[] nums = new int[5];
        String str = null;

        try {
            j = 18/i;
            System.out.println(nums[5]);
            System.out.println(str.length());
        } catch (ArithmeticException e) {
            //throw new RuntimeException(e);
            System.out.println("Division by ZERO not possible. "+e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index out of the range. "+e);
        }catch (Exception e){
            System.out.println("Something went wrong "+e);
        }

        System.out.println(j);
        System.out.println("Completed.. bye ");
    }
}
