package com.ct.logical;

public class reverse {

    public static void main(String[] args) {

        int num = 12345;
        int res = 0;
        int rem = 0;

        while (num > 0) {

            rem = num % 10;

            res = (res * 10) + rem;

            num = num / 10;
        }
        System.out.println("Reverse of a number: " + res);

    }

}