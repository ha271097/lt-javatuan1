package com.company;

import java.util.Scanner;

public class bt2 {
    public  static void  main( String [] args){
        System.out.println("Enter a,b,c");
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();;
        if(a+b>c && b+c>a && c+a>b){
            System.out.println(" this is triangle");
        }
        else {
            System.out.println(" this is not triangle");
        }
    }
}
