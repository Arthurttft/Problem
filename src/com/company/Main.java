package com.company;

import org.apache.xmlgraphics.ps.PSDictionaryFormatException;

import java.util.Random;
import java.lang.Math.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*problem1
       for (int i = 1; i <= 20; i++) {
            //System.out.println(i);
        /*}
        /*problem2
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {

            continue;}
            System.out.println(i);}*/
        /*problem3
        for(int i = -20; i <= 60; i += 2){
           if(i != 0){
            System.out.println(i);}
        }*/
        /*problem4
        for(int i = -20; i >= -60; i--){
            if(i % 2 == 0){
                continue;}

        System.out.println(i);}*/
        /*problem5
        int number = 0;
        for(int i = 1;i <= 100;i++ ){
            number =number + i;
        }
            System.out.println(number);*/
        /*problem6
        int number = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0)
                number = number + i;
        }
        System.out.println(number);*/
        /*problem7
        int count = 100 - 1 + 1;
        int number = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1)
                number = number + i;
        }
        int result = number/(count/2);
        System.out.println(result);*/
        /*problem8
        int i, number = 0, sum = 0;
        double avg;
        {

            System.out.println("Input the 10 numbers : ");

        }
        for (i = 0; i < 10; i++) {
            Scanner in = new Scanner(System.in);
            number = in.nextInt();

            sum += number;
        }
        avg = sum / 10;
        System.out.println(sum);
        System.out.println(avg);*/
        /*problem9
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int i;
        for(i = 1; i <= number; i++){
            System.out.println("Number is : " +i+" and cube of " +i+" is : "+(Math.pow(i,3)));
        }*/
        /*problem10
        int i;
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (i = 1; i <= 10; i++) {
            System.out.println(number+" X "+i+" = " +number*i);
        }*/
        /*problem11
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number");
        int number = sc.nextInt();
        int count=0;
        for(int i = 1 ; i <=n ; i++)
        {
            if(number % i == 0)
                count=count+1;
        }
        if(count == 2)
            System.out.println("Prime Number");
        else
            System.out.println("Not a Prime Number");
        sc.close();*/
        /*promblem12
        int i;
        int a = 0;
        int b = 0;
        int c = 1;
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (i = 1; i <= number; i++) {
            a = b;
            b = c;
            c = a + b;
            System.out.print(a+" ");

        }*/




    }
}


