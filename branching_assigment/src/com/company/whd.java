package com.company;

import java.util.Scanner;

public class whd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Working Hours In Day:");
        int workingHoursInDay = input.nextInt();
        if (workingHoursInDay > 0 && workingHoursInDay <= 8) {
            int hourlyRate = 10;
            int salaryPerDay = (workingHoursInDay * hourlyRate);
            System.out.println("Salary for " + workingHoursInDay + " hours: " + salaryPerDay + " EUR");
        } else if (workingHoursInDay <= 8 || workingHoursInDay > 24) {
            System.out.println("Please enter correct hour amount");
        } else {
            int extraHourlyRate = 15;
            int salaryPerDay = (80 + ((workingHoursInDay - 8) * extraHourlyRate));
            System.out.println("Salary for " + workingHoursInDay + " hours: " + salaryPerDay + " EUR");
        }

    }
}
