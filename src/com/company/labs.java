package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class labs {
        public static void main(String[] args) {
            int a = 0;
            int[] array;
            array = new int[20];
            for (int i = 0; i < array.length; i++) {
                array[i] = ((int) (Math.random() * 9));
                System.out.print(array[i]);
            }
            System.out.println(" ");
            for (int i = 0; i < array.length; i++) {
                if (array[i] != 0) {
                    System.out.print(array[i]);
                }
            }
        }
    }
