package com.company;

import java.util.Scanner;

public class whd2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Working Hours In Day:");
        int workingHoursInDay = input.nextInt();
        System.out.println("Salary for " + workingHoursInDay + " hours: " + salaryPerDay(workingHoursInDay) + " EUR");
    }

    public static int salaryPerDay(int workingHoursInDay) {
        if (workingHoursInDay > 0 && workingHoursInDay <= 8) {
            return (workingHoursInDay * 8);
        } else if (workingHoursInDay > 8 && workingHoursInDay <= 24) {
            return (80 + ((workingHoursInDay - 8) * 15));
        }
        return 0;
    }
}