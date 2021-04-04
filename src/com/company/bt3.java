package com.company;

import java.util.Scanner;

public class bt3 {
    public static void main(String [] args){
        System.out.println("enter number");
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        if(num%3==0 && num%5==0){
            System.out.println("FIZZBUZZ");
        }
        else if(num %3==0){
            System.out.println("FIZZ");
        }
        else if( num %5==0){
            System.out.println("BUZZ");
        }
    }
}
