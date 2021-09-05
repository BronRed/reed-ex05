/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Brian Reed
 */

import java.util.Scanner;

public class Solution05 {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        //Prompt for first number
        //Prompt for second number
        //Convert num1 and num2 from string to integer
        //Do calculations with int1 and int2 and print results
        String num1, num2;
        int int1, int2;
        System.out.print("What is the first number? ");
        num1 = scan.nextLine();
        System.out.print("What is the second number? ");
        num2 = scan.nextLine();
        int1 = Integer.parseInt(num1);
        int2 = Integer.parseInt(num2);
        System.out.print(String.format("%s + %s = %d\n%s - %s = %d\n%s * %s = %d\n%s / %s = %d",
                num1, num2, (int1+int2), num1, num2, (int1-int2), num1, num2, (int1*int2), num1, num2, (int1/int2)));
    }
}
