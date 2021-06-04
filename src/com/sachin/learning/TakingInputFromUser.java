package com.sachin.learning;
import java.util.Scanner;

public class TakingInputFromUser {
    public static void main(String[] args) {
        System.out.println("Taking input from the user:");

        Scanner sc = new Scanner(System.in); //System.in means reading from the keyboard
        System.out.println("Enter Number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter Number 2: ");
        int num2 = sc.nextInt();
        int sum = num1+num2;
        System.out.println("The sum of these numbers is :"+sum);

    }
}
