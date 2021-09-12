package com.company;

public class Time {
    public static void main(String[] args) {
        short Time = 120;
        if (Time < 12) {
            System.out.println("Good morning Sunshine!");
        }
        if ((Time>=13) && (Time<=19)){
            System.out.println("Good Afternoon. Work Hard!");
        }
        if ((Time>=20) && (Time<=24)){
            System.out.println("Good Evening. Get some rest!");
        }
        if ((Time<0) || (Time>24)){
            System.out.println("Please check your clock settings!");
        }

    }
}
