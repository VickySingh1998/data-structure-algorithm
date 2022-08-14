package com.bridgelabz;

public class PrimeNumber {
    public static void main(String[] args) {

        int i , num ;
        String primeNumbers = "";

        for (i = 0; i <= 1000; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {

                primeNumbers = primeNumbers + i + "\n";
            }
        }
        System.out.println("Prime numbers from 0 to 1000 are :");
        System.out.println(primeNumbers);
    }
}
