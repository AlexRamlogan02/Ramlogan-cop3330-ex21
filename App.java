package org.example;

import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alexandra Ramlogan
 */
public class App 
{
    public static void main( String[] args ) {
        Scanner scan = new Scanner(System.in);
        int month;
        String a = "January", b = "February", c = "March", d = "April", e = "May", f = "June", g = "July", h = "August",
                i = "September", j = "October", k = "November", l = "December";
        System.out.print("Please enter the name of the month");
        month = scan.nextInt();
        System.out.print("The month is ");
        if (month == 1)
            System.out.print(a);
        else if (month == 2)
            System.out.print(b);
        else if (month == 3)
            System.out.print(c);
        else if (month == 4)
            System.out.print(d);
        else if (month == 5)
            System.out.print(e);
        else if (month == 6)
            System.out.print(f);
        else if (month == 7)
            System.out.print(g);
        else if (month == 8)
            System.out.print(h);
        else if (month == 9)
            System.out.print(i);
        else if (month == 10)
            System.out.print(j);
        else if (month == 11)
            System.out.print(k);
        else if (month == 12)
            System.out.print(l);
        System.out.print("\n");
    }
}
