package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ymd {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Please write the day:");
    int day = input.nextInt();
    if ((day<=0) || (day>31)) {
        System.out.println("Please enter day from 1 to 31");
    }
    int day2 = input.nextInt();
    System.out.println("Please write the month:");
   int month = input.nextInt();
    if ((month<=0) || (month>12)) {
        System.out.println("Please enter month from 1 to 12");
    }
    int month2 = input.nextInt();
    System.out.println("Please write the year:");
    int year = input.nextInt();
    if ((year<=0) || (year>2021)) {
        System.out.println("Please enter year up to 2021");
    }
    int year2 = input.nextInt();
    System.out.println("Please select the date formatting: 1 - YYYY/MM/DD, 2 - YYYY.MM.DD:");
   int digit = (input.nextInt());
    if (digit ==1){
   System.out.println("Your date is:" + year2 + "/" + month2 + "/" + day2);}
   else{
       System.out.println("Your date is:" + year2 + "." +month2 + "." + day2);}
}}
// I don't understand how to make the program to go onto next step if the entered value is correct (((

