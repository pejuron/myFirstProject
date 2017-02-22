package com.company;

import java.util.Random;

public class GenerateRandom {

    static Random random = new Random();

    private static String getRandomBoys() {

        String[] randomBoys = { "Joru","Mark","Carl", "Julleane", "Bert" };

        int randomIndex = random.nextInt((randomBoys.length-1)+1);
        return randomBoys[randomIndex];
    }

    private static String getRandomGirls() {

        String[] randomGirls = { "Grace","Louise","Kathleen", "Maria Ossawa", "Kathryn" };

        int randomIndex = random.nextInt((randomGirls.length-1)+1);
        return randomGirls[randomIndex];
    }

    private static String getRandomRelations() {

        String[] randomRelations = { " hates "," loves "," is dating with ", " was having fun with "};

        int randomIndex = random.nextInt((randomRelations.length-1)+1);
        return randomRelations[randomIndex];
    }

    static void getRandomRelationships(){
        System.out.print(getRandomBoys() + getRandomRelations() + getRandomGirls() + ".");
    }
}
