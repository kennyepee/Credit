package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Number: ");
        String num = input.nextLine();
        int sum = 0;


        int[] ints = new int[num.length()];
        for (int i = 0; i < num.length(); i++) {
            ints[i] = Integer.parseInt(num.substring(i, i + 1));
        }
        for (int i = ints.length - 2; i >= 0; i = i - 2) {
            int j = ints[i];
            j = j * 2;
            if (j > 9) {
                j = j % 10 + 1;
            }
            ints[i] = j;
        }

        for (int i = 0; i < ints.length; i++) {
            sum += ints[i];
        }
        String cardType = String.valueOf(num);

        if (num.length() == 15 && sum % 10 == 0 && num.charAt(0) == '3' && (num.charAt(1) == '4' || num.charAt(1) == '7')) {
            System.out.println("AMEX");
        } else if (num.length() == 16 && sum % 10 == 0 && num.charAt(0) == '5' &&
                (num.charAt(1) == '1' || num.charAt(1) == '2' || num.charAt(1) == '3' || num.charAt(1) == '4' || num.charAt(1) == '5')) {
            System.out.println("MASTERCARD");
        } else if ((num.length() == 13 || num.length() == 16) && sum % 10 == 0 && num.charAt(0) == '4') {
            System.out.println("VISA");
        } else {
            System.out.println("INVALID");
        }
    }
}
