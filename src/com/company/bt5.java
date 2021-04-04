package com.company;

import java.util.Scanner;

public class bt5 {
    public static void main(String[]args){
        System.out.println("Enter a,b,c");
        double a,b,c;
        Scanner sc =new Scanner(System.in);
        a= sc.nextDouble();
        b= sc.nextDouble();
        c= sc.nextDouble();
        double delta = (b*b)-4*a*c;
        if(delta>0){
            System.out.println(" x1 = " + (-b+Math.sqrt(delta))/2*a);
            System.out.println("x2 = " + (-b-Math.sqrt(delta))/2*a);
        }
        else if(delta==0){
            System.out.println("x =" + -b/2*a);
        }
        else {
            System.out.println("PT vo nghiem");
        }
    }
}
