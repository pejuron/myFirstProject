package com.company;

public class GenerateLoops {

    static int i = 1;

    static void generateWhileLoop() {
        while (i < 11) System.out.print("[" + i++ + "]");
    }

    static void generateDoWhileLoop() {
        i = 1;
        do System.out.print("[" + i++ +"]");
        while( i < 11 );
    }

    static void generateForLoop() {
        for( i = 1; i < 11; i++ )
            System.out.print("[" + i +"]");
    }
}
