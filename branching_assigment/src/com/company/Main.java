package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        short numberA = 133;
        short numberB = -22;
        {
            System.out.println((numberA == numberB) ? "Numbers are equal" : "Numbers are not equal");
            System.out.println((numberA > numberB) ? "Number A is larger than Number B" : "Number B is larger than Number A");
            System.out.println((numberA < numberB) ? "Number A is smaller than number B" : "Number B is smaller than Number A");
            System.out.println(numberA % 2 == 0 ? "Number A is even" : "Number A is odd");
            System.out.println(numberB % 2 == 0 ? "Number B is even" : "Number B is odd");
            System.out.println(numberA > 0 ? "Number A is positive" : "Number A is negative");
            System.out.println(numberB > 0 ? "Number B is positive" : "Number B is negative");
        }
        if (numberA < 100){
            System.out.println("Number A is less than 100");}
        if (numberB < 100){
                System.out.println("Number B is less than 100");
            }
        }

        }




