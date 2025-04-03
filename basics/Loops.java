package basics;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        // for loop
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int fnum = scanner.nextInt();
        for (int i=0; i<fnum; i++ ){
            System.out.println("Hi "+i);
        }

        System.out.println();

        // for each loop
       int[] numArr = {11,12,14,16,17};
        for(int i: numArr){
            System.out.println("hello "+i);
        }

        // While loop
        int countOne = 1;
        while (countOne <= 4){
            System.out.println("hello while "+countOne);
            countOne++;
        }

        // Nested While loop
        int countTwo = 1;
        while (countTwo <= 4){
            System.out.println("hello while "+countTwo);
            int childCount = 1;
            while (childCount <= 2){
                System.out.println("hello nested while "+childCount);
                childCount++;
            }
            countTwo++;
        }

        // do while
        int doCount = 5;
        do{
            System.out.println("hello do-while "+ doCount);
            doCount++;
        }while (doCount <= 4);

        // break statements

        // continue
        for (int i=1; i<fnum; i++ ){
            if(i % 2 == 0 ){
                continue;
            }
            System.out.println("Hi "+i);
        }

        // break statement
        for (int i=1; i<fnum; i++ ){
            if(i % 3 == 0 ){
                break;
            }
            System.out.println("Hibreak "+i);
        }

    }
}
