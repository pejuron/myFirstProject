package com.company;

import java.util.Random;

public class GenerateRandom {

    static String[] randomBoys = { "Joru", "Mark", "Carl", "Julleane", "Bert" };
    static String[] randomGirls = { "Grace", "Louise", "Kathleen", "Maria Ossawa", "Liza" };
    static String[] randomRelations = { " hates "," loves "," is dating with ", " was having fun with "};

    static Random random = new Random();
    static int randomIndex;

    private static String getRandomBoys() {
        randomIndex = random.nextInt((randomBoys.length-1)+1);
        return randomBoys[randomIndex];
    }

    private static String getRandomGirls() {
        randomIndex = random.nextInt((randomGirls.length-1)+1);
        return randomGirls[randomIndex];
    }

    private static String getRandomRelations() {
        randomIndex = random.nextInt((randomRelations.length-1)+1);
        return randomRelations[randomIndex];
    }

    static void getRandomRelationships(){
        System.out.print(getRandomBoys() + getRandomRelations() + getRandomGirls() + ".");
    }
}
