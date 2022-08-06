package com.company.read;

import java.util.Scanner;

public class convertMoney {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to convert!");
        number =sc.nextInt();
        int rate = 23000;
        int convertToVND= number*rate;
        System.out.println(convertToVND);
    }

}
