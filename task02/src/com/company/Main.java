package com.company;

import java.util.Scanner;

public class Main {
    static void displayMovieInfo()
    {
        String movieName,genre;
        int year;
        float length;
        Scanner scan=new Scanner(System.in);
        System.out.println(" ***** MOVIE INFORMATION *****");
        System.out.print("Movie Name: ");
        movieName=scan.nextLine();
        System.out.print("Movie Genre: ");
        genre=scan.nextLine();
        System.out.print("Movie Year: ");
        year=scan.nextInt();
        System.out.print("Movie length: ");
        length=scan.nextFloat();
        System.out.println();
        System.out.println("Displaying data...\n");
        System.out.println("Name Entered: "+movieName);
        System.out.println("Genre Entered: "+genre);
        System.out.println("Year Entered: "+year);
        String myFormattedLength=String.format("%.2f",length);
        System.out.print("Length Entered: "+myFormattedLength);
    }

    public static void main(String[] args) {

        displayMovieInfo();
    }
}
