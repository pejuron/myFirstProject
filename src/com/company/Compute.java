package com.company;

public class Compute {

    public static int computeSum(int num){
        int sum = 0;

        for( int i = 1; i <= num; i++ ) {
            sum += i;
        }
        return sum;
    }

    public static int factorial(int num){
        int result = 1;

        if ( num == 0 ) return 1;
        else {
            for( int i = num; i >= 1; i-- ) {
                result *= i;
            }
        }
        return result;
    }

    public static void evenGenerator(int num) {
        int n = 0;
        int[] evenNumbers = new int[num];

        for ( int i = 1; i <= num*2; i++ ) {
            if ( i%2 == 0 ) {
                evenNumbers[n] = i;
                n++;
            }
        }
        for ( int i = 0; i < evenNumbers.length; i++ ) {
            System.out.print(evenNumbers[i] + " ");
        }
    }

    public static void fibonacci(int num){
        int[] myFiboNum = new int[num];

        for ( int i = 0; i < myFiboNum.length; i++ ) {
            if ( i > 1 ) myFiboNum[i] = myFiboNum[i-2] + myFiboNum[i-1] ;
            else myFiboNum[i] = i;
        }

        for ( int i = 0; i < myFiboNum.length; i++ ) {
           System.out.print( myFiboNum[i] + " ");
        }
    }

    public static void getRandomBoys() {
        String[] randomBoys = {"Joru","Mark","Carl"};
    }

    public static void getRandomGirls() {
        String[] randomGirls = {"Grace","Louise","Kathleen"};
    }

    public static void getRandomRelations() {
        String[] randomRelations = {" hates "," loves "," is dating with "};
    }
}
