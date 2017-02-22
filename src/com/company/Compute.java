package com.company;
import java.util.*;

public class Compute {

    static int computeSum(int num){
        int sum = 0;

        for( int i = 1; i <= num; i++ ) {
            sum += i;
        }
        return sum;
    }

    static int factorial(int num){
        int result = 1;

        System.out.print("Factorial(" + num + "): ");

        if ( num == 0 ) return 1;
        else {
            for( int i = num; i >= 1; i-- ) {
                if ( i > 1 ) System.out.print(i + "*");
                else System.out.print(i + " = ");
                result *= i;
            }
        }
        return result;
    }

    static void evenGenerator(int num) {
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

    static void fibonacci(int num){
        int[] myFiboNum = new int[num];

        for ( int i = 0; i < myFiboNum.length; i++ ) {
            if ( i > 1 ) myFiboNum[i] = myFiboNum[i-2] + myFiboNum[i-1] ;
            else myFiboNum[i] = i;
        }

        for ( int i = 0; i < myFiboNum.length; i++ ) {
           System.out.print( myFiboNum[i] + " ");
        }
    }

    private static String getRandomBoys() {

        Random random = new Random();
        String[] randomBoys = { "Joru","Mark","Carl", "Julleane", "Bert" };

        int randomIndex = random.nextInt((randomBoys.length-1)+1);
        return randomBoys[randomIndex];
    }

    private static String getRandomGirls() {

        Random random = new Random();
        String[] randomGirls = { "Grace","Louise","Kathleen", "Maria Ossawa", "Kathryn" };

        int randomIndex = random.nextInt((randomGirls.length-1)+1);
        return randomGirls[randomIndex];
    }

    private static String getRandomRelations() {

        Random random = new Random();
        String[] randomRelations = { " hates "," loves "," is dating with ", " was having fun with "};

        int randomIndex = random.nextInt((randomRelations.length-1)+1);
        return randomRelations[randomIndex];
    }

    static void getRandomRelationships(){
        System.out.print(getRandomBoys() + getRandomRelations() + getRandomGirls() + ".");
    }
}
