package com.company;

public class Main {

    public static void main(String[] args) {
       System.out.println(isDivisible(3, 5));
    }

    public static boolean isDivisible(int wallLength, int pixelSize) {

        return wallLength%pixelSize==0;
    }
}
