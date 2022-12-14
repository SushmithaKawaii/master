package com.example.sushmitha;

import java.util.Arrays;

public class Using_simple_Arrays {

    public static void main(String[] args) {

        System.out.println("Array of primitives");
        int[] ints = {9, 6, 3};
        Arrays.sort(ints);
        for (int i = 0; i < ints.length; i++) {
        	System.out.println(ints[i]);
        }

        System.out.println("Array of strings");
        String[] strings = {"Red", "Greeen", "Blue"};
        Arrays.sort(strings);
        for (String color : strings) {
        	System.out.println(color);
        }

        System.out.println("Setting an initial size");
        int[] sized = new int[10];
        for (int i = 0; i < sized.length; i++) {
        	sized[i] = i * 100;
        }
        for (int value : sized) {
        	System.out.println(value);
        }

        System.out.println("Copying an array");
        int[] copied = new int[5];
        System.arraycopy(sized, 5, copied, 0, 5);
        for (int value : copied) {
        	System.out.println(value);
        }
    }

}
