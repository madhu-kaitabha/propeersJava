package basics;

public class DataTypes {

    public static void main(String[] args) {
        //primitive Integer
        // int data type.
        //It is 4 Bytes or 32-bit signed two's complement integer.
        // Whole numbers between -2147483648 and 2147483647 can be stored in this data format.
        int num1 = 5;
        int num2 = 6;
        System.out.println(num1+num2);

        //byte
        byte n;
        n = 127;
        System.out.println(n);

        //short
        short m= 1234;
        System.out.println(m);

        //long
        long lnum = 15000000000L;
        System.out.println(lnum);

        // primitive Character
        //char data type
        //A single character is stored in this data type. Single quotes, such as 'A' or 'a', must be used to enclose the character.
        //Alternatively, Unicode values can be used to show certain characters. It is 2 bytes in size.
        char a = 'A'; // Represents the character 'A' (Unicode U+0041)
        char simely = '\u263A'; // Represents the smiley face character (Unicode U+263A)
        System.out.println(a);
        System.out.println(simely);


        //primitive Float
        // float - is a 32-bit single-precision floating-point data type.
        //capable of storing fractional integers between 3.4e-038 and 3.4e+038. The value should end with an “f.”
        float f1 = 5.6f;
        System.out.println(f1);

        //primitive Double
        //double - is a 64-bit double-precision floating-point data type
        //capable of storing fractional integers between 1.7e−308 and 1.7e+308
        //The value should end with a “d
        double d1 = 5.678;
        double d2 = Double.MAX_VALUE;
        double d3 = Double.MIN_VALUE;
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        //primitive Boolean
        boolean bool1 = true;
        boolean bool2 = false;
        System.out.println(bool2);
        System.out.println(bool1);

    }
}
