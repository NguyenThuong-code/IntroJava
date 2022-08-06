package com.company.read;


import java.util.Scanner;

public class readNum {
    public static void units(int number){
        switch (number) {
            case 0:
                System.out.println("zero");
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
            case 10:
                System.out.println("ten");
                break;
        }
    }
    public static void lessThanTwenty(int number){
        switch (number){
            case 11:
                System.out.println("eleven");
                break;
            case 12:
                System.out.println("twelve");
                break;
            case 13:
                System.out.println("thirteen");
                break;
            case 14:
                System.out.println("fourteen");
                break;
            case 15:
                System.out.println("fifteen");
                break;
            case 16:
                System.out.println("sixteen");
                break;
            case 17:
                System.out.println("seventeen");
                break;
            case 18:
                System.out.println("eighteen");
                break;
            case 19:
                System.out.println("nineteen");
                break;
        }

    }
    public static void lessThanHundress(int number){
        switch (number) {
            case 2:
                System.out.println("twenty");
                break;
            case 3:
                System.out.println("thirty");
                break;
            case 4:
                System.out.println("forty");
                break;
            case 5:
                System.out.println("fifty");
                break;
            case 6:
                System.out.println("sixty");
                break;
            case 7:
                System.out.println("seventy");
                break;
            case 8:
                System.out.println("eighty");
                break;
            case 9:
                System.out.println("ninety");
                break;

        }

    }
    public static void lessThanThounsand(int number){
        switch (number) {
            case 1:
                System.out.println("one hundred");
                break;
            case 2:
                System.out.println("two hundred");
                break;
            case 3:
                System.out.println("three hundred");
                break;
            case 4:
                System.out.println("four hundred");
                break;
            case 5:
                System.out.println("fif hundred");
                break;
            case 6:
                System.out.println("six hindred");
                break;
            case 7:
                System.out.println("seven hundred");
                break;
            case 8:
                System.out.println("eight hundred");
                break;
            case 9:
                System.out.println("nine hundred");
                break;

        }

    }
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check!");
        number = sc.nextInt();
        if(number<0|| number>999){
            System.out.println("Number out of Range");
        }else  if(number>99&& number <1000) {
            int hundred = number / 100;
            lessThanThounsand(hundred);
            int n = number % 100;
            if (n < 20 && n > 10) {
                lessThanTwenty(n);
            } else if (n < 100 & n > 20) {
                int t = n / 10;
                lessThanHundress(t);
                int z = n % 10;
                units(z);
            }

        }else if(number<100&& number>10){
        int j = number/10;
        lessThanHundress(j);
        int i = number%10;
        units(i);
        }else if(number<=10){
            units(number);
        }
    }

}
