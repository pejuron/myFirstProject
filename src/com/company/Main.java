package com.company;

public class Main {

    public static void main(String[] args) {

        int i = 1;

        System.out.println("While Loop:");
        while( i < 11 ) System.out.print("[" + i++ +"]");

        i = 1;
        System.out.println("\nDo-While Loop:");
        do System.out.print("[" + i++ +"]");
        while( i < 11 );

        System.out.println("\nFor Loop:");
        for( i = 1; i < 11; i++ )
            System.out.print("[" + i +"]");

        System.out.println("\n\nSum of Loops:");
        System.out.println(Compute.computeSum(6));

        System.out.println("\nFactorial:");
        System.out.println(Compute.factorial(7));

        System.out.println("\nEven number generator:");
        Compute.evenGenerator(8);

        System.out.println("\n\nFibonacci:");
        Compute.fibonacci(9);

        System.out.println("\n\nRandom Relationships");
        Compute.getRandomRelationships();
    }
}
