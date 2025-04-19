package objectOrientedProgaming.interfaces;

interface Sum{
    int add(int a, int b);
}
public class LambdaFunctionWithReturn {
    public static void main(String[] args) {
        Sum obj = (i,j) -> i + j;
        System.out.println(obj.add(4,6));
    }
}
