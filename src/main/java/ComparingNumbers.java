/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        String num1 = scanner.next();
        System.out.print("Enter the second number: ");
        String num2 = scanner.next();
        System.out.print("Enter the third number: ");
        String num3 = scanner.next();

        if (num1.equals(num2) && num1.equals(num3)){
           System.exit(0);
        }

        int largestNum = Integer.parseInt(num1);

        if (largestNum < Integer.parseInt(num2)){
            largestNum = Integer.parseInt(num2);
        }

        if (largestNum < Integer.parseInt(num3)){
            largestNum = Integer.parseInt(num3);
        }

        System.out.println("The largest number is " + largestNum);
    }
}
