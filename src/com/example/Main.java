package com.example;

import java.io.FilterOutputStream;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2; //1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        System.out.println("previous result = " + previousResult);

        result = result - 1;
        System.out.println("3 - 1 = " + result);
        System.out.println("previous result = " + previousResult);

        result = result * 10;
        System.out.println("2*10= " + result);

        result = result / 5;
        System.out.println("20/5= " + result);

        result = result % 3;
        System.out.println("4 % 3 = " + result );

        result++;
        System.out.println("+ " + result);

        result--;
        System.out.println(" -  " + result);

        result *= 10;
        System.out.println(" * " + result);

        result /= 3;
        System.out.println(" / " + result);
    }
}
