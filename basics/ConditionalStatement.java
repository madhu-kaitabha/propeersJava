package basics;

import java.util.Scanner;

public class ConditionalStatement {

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        // if else Statement
        System.out.println("Enter a number");
        int a = scaner.nextInt();
        int b = a % 2;
        if (b == 0) {
            System.out.println(a + " is an even number");
        } else {
            System.out.println(a + " is an odd number");
        }

        // terenary operator
        String tropt = (b == 0) ? a + " is an even number" : a + " is an odd number";
        System.out.println(tropt);

        // if-else-if ladder
        System.out.println("Enter a number");
        int i = scaner.nextInt();
        if (i == 1)
            System.out.println("January");

        else if (i == 2)
            System.out.println("February");
        else if (i >= 3 && i <= 5) {

            if (i == 3) {
                System.out.println("March");
            }
            if (i == 4) {
                System.out.println("April");
            }
            if(i == 5) {
                System.out.println("May");
            }
        }
        else
            System.out.println("June");


        // Switch statement
        int num = scaner.nextInt();
        switch (num){
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("Mar");
                break;
            case 4:
                System.out.println("April");
                break;
            default:
                System.out.println("Not present in database");
        }
    }


}

