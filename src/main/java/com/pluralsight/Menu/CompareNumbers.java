package com.pluralsight.Menu;

public class CompareNumbers {
    public static void main(String[] args) {
        System.out.println(isEven(3));
        System.out.println(isPositive(-1));

    }

    public static String isEven(int number) {
        if(number % 2 == 0) {
            return ("True");


        }
        else{
            return ("False");
        }




    }

    public static String isPositive(double number){
        if(number > 0) {
            return ("True");

        }
        else{
            return("False");
        }

    }
}
