package com.company;

import java.util.Scanner;

public class Main {
    static int sum(int arr[])
    {
        int totalSum=0;
        for(int element:arr)
        {
            totalSum=totalSum+element;
        }
        return totalSum;
    }
    static double average(int arr[])
    {
        double avg=0;
        for(int element:arr)
        {
            avg=avg+element;
        }
        return avg/arr.length;
    }
    static int largest(int arr[])
    {
        if(arr.length==0)
        {
            System.out.println("Array does not have any element");
            return -1;
        }
        int maximumValue=arr[0];
        for(int element:arr)
        {
            if(maximumValue<element)
                maximumValue=element;
        }
        return maximumValue;
    }
    static int smallest(int arr[])
    {
        if(arr.length==0)
        {
            System.out.println("Array does not have any element");
            return -1;
        }
        int smallestValue=arr[0];
        for(int element:arr)
        {
            if(smallestValue>element)
                smallestValue=element;
        }
        return smallestValue;
    }

    public static void main(String[] args) {
        final int totalNumbers=10;  //Edit the number here and get their calculations
        System.out.print("Enter "+totalNumbers+" numbers: ");
        Scanner scan=new Scanner(System.in);
        int [] numbers=new int[totalNumbers];
        for(int i=0;i<totalNumbers;i++)
        {
            numbers[i]=scan.nextInt();
        }
        
        System.out.println("Sum is: "+sum(numbers));
        System.out.println("Average is: "+average(numbers));
        System.out.println("Largest is: "+largest(numbers));
        System.out.println("Smallest is: "+smallest(numbers));
    }
}
