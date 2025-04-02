package basics;

public class Operators {

    public static void main(String[] args) {
        //Arithmetic Operators
        // Addition (+)
        int a, b;
        a = 10;
        b = 10;
        int sum = a + b;
        System.out.println(sum);

        // subtraction (-)
        int s1 = 100;
        int s2 = 1000;
        int diff = s2 - s1;
        System.out.println(diff);

        // division operatoor (/)
        int div1 = 1000;
        int div2 = 100;
        int quotient = div1/div2;
        System.out.println(quotient);

        //Multiplication operator (*)
        int m1 = 10;
        int m2 = 100;
        int product = m1 * m2;
        System.out.println(product);

        // Modulo operator (%) gives remainder out division
        int mod1 = 30;
        int mod2 = 9;
        int modulo = mod1 % mod2; // gives 3
        System.out.println(modulo);


        // Unary Operators

        //Increment operator (++)
        int inc1 = 10;
        inc1++;
        System.out.println(inc1);// 11 is output

        //Increment operator (--)
        int dec1 = 10;
        dec1--;
        System.out.println(dec1); //9 is output

        //Unary plus (+). indicate positive value. no effect on the operand
        int unp = +5;
        System.out.println(unp);

        //Unary minus (-) Negates the value of the operand.
        int unm = -5;
        System.out.println(unm);

        //Logical NOT (!)
        boolean isTrue = false;
        boolean isFalse = !isTrue;
        System.out.println(isFalse);


        //Compound assignment operators include

        //Addition assignment (+=)
        int assgn = 5;
        assgn += 3; // assgn = 8 (equivalent to assgn = aMod + 3)
        System.out.println(assgn);

        //Subtraction assignment (-=)
        int asgnSub = 10;
        asgnSub -= 4; // asgnSub = 6 (equivalent to asgnSub = asgnSub - 4)
        System.out.println(asgnSub);

        //Multiplication assignment (*=)
        int aM = 4;
        aM *= 2; // aM = 8 (equivalent to aM = aM * 2)
        System.out.println(aM);

       // Division assignment (/=)
        int ad = 10;
        ad /= 2; // ad = 5 (equivalent to ad = ad / 2)
        System.out.println(ad);

        //Modulus assignment (%=)
        int aMod = 10;
        aMod %= 3; // aMod = 1 (equivalent to aMod = aMod % 3)
        System.out.println(aMod);


        //Relational Operators

        //Equal to (==). Checks if two operands are equal.
        int ae = 5;
        int be = 5;
        boolean isEqual = (ae == be); // isEqual = true

        //Not equal to (!=). Checks if two operands are not equal.
        int ane = 5;
        int bne = 7;
        boolean isNotEqual = (ane != bne); // isNotEqual = true

        //Greater than (>)
        int ag = 10;
        int bg = 5;
        boolean isGreater = (ag > bg); // isGreater = true

        //Less than (<). Checks if the first operand is less than the second operand.
        int al = 3;
        int bl = 7;
        boolean isLess = (al < bl); // isLess = true

        //Greater than or equal to (>=). Checks if the first operand is greater than or equal to the second operand.
        int aGe = 5;
        int bGe = 5;
        boolean isGreaterOrEqual = (aGe >= bGe); // isGreaterOrEqual = true

        //Less than or equal to (<=). Checks if the first operand is less than or equal to the second operand.
        int ale = 4;
        int ble = 4;
        boolean isLessOrEqual = (ale <= ble); // isLessOrEqual = true

        // Logical Operators

        //Logical AND (&&). Returns true if both operands are true.
        boolean isRaining = true;
        boolean isWindy = true;
        boolean stayIndoors = isRaining && isWindy; // stayIndoors = true

        //Logical OR (||). Returns true if at least one of the operands is true.
        boolean isHungry = true;
        boolean isThirsty = false;
        boolean eatOrDrink = isHungry || isThirsty; // eatOrDrink = true

        //Logical NOT (!)Negates the boolean value of the operand.
        boolean isLightOn = true;
        boolean isDark = !isLightOn; // isDark = false

        // Logical operators are often used in combination with relational operators to create more complex conditions.
        int age = 25;
        boolean isStudent = true;
        boolean isEligible = (age >= 18) && isStudent; // isEligible = true

        //Ternary Operator. a shorthand way of writing an if-else statement
        int age1 = 20;
        String status = (age1 >= 18) ? "Adult" : "Minor";
        System.out.println(status);





    }
}
