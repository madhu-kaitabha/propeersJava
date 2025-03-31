package basics;

import java.util.Scanner;

public class InOut {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);  //creating scanner object
        System.out.print("Enter your full name: ");
        String name = scan.nextLine();

        System.out.print("Enter your age: ");
        int age = scan.nextInt();

        System.out.print("Enter your salary: ");
        double salary = scan.nextDouble();

        System.out.print("Are you happy with salary? True/False: ");
        boolean ifHappy = scan.nextBoolean();

        System.out.println();
        System.out.println("Name: "+name+"\nAge: "+age+"\nSalary: "+salary+"\nHappy? "+ ifHappy);

    }

}
