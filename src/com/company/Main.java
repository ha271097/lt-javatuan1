package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int num;
        System.out.println("Enter number");
        Scanner sc= new Scanner(System.in);
        num = sc.nextInt();
        if(num >= 0){
            System.out.println(" this is integer");
        }
        else {
            System.out.println("this is not integer");
        }
    }
}

