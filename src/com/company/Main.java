package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year to check!");
        number = sc.nextInt();
        if (number % 4 == 0) {
            if (number % 100 == 0) {
                if (number % 400 == 0) {
                    System.out.println("is leap year");
                } else {
                    System.out.println("is not leap year");
                }
            }else{
                    System.out.println("is leap year");
                }
        }else{
                    System.out.println("is not leap year");
                }
            }
        }

