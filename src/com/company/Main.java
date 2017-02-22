package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("While Loop:");
        GenerateLoops.generateWhileLoop();

        System.out.println("\nDo-While Loop:");
        GenerateLoops.generateDoWhileLoop();

        System.out.println("\nFor Loop:");
        GenerateLoops.generateForLoop();

        System.out.println("\n\nSum of Loops:");
        System.out.println(Compute.computeSum(6));

        System.out.println("\nFactorial:");
        System.out.println(Compute.factorial(7));

        System.out.println("\nEven number generator:");
        Compute.evenGenerator(8);

        System.out.println("\n\nFibonacci:");
        Compute.fibonacci(9);

        System.out.println("\n\nRandom Relationships:");
        GenerateRandom.getRandomRelationships();
    }
}
