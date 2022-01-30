package com.hank;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int i;
        int j;

        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter a no: ");
        int numberEntered = scanner.nextInt();

    // Print the top part of diamond
        for (i=1; i<=numberEntered; i++) {
            //print the spaces
            for (j=1; j <= numberEntered-i; j++){
                System.out.print(" ");
            }
            //print the *
            for (j=1; j<= i*2-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // Print the bottom part of diamond
        for (i=numberEntered-1; i>0; i--) {
            //print the spaces
            for (j=1; j <= numberEntered-i; j++){
                System.out.print(" ");
            }
            //print the *
            for (j=1; j<= i*2-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("31 Jan 2022");




    }
}

