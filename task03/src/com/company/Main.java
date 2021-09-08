package com.company;

import java.util.Scanner;

public class Main {
    static void checkValueType()
    {
        int val;
        System.out.print("Enter the Integral Value: ");
        Scanner scan=new Scanner(System.in);
        val=scan.nextInt();
        if(val<0)
        {
            System.out.println("You entered a negative value.");
        }
        else
        {
            System.out.println("You entered a positive value.");
        }
    }

    public static void main(String[] args) {
        checkValueType();
    }
}
