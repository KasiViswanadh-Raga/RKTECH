package com.task2.hollowsquarepattern;

public class HollowSquarePatterns {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            printPattern1(i);
            System.out.print("\t");
            printPattern2(i);
            System.out.print("\t");
            printPattern3(i);
            System.out.println();
        }
    }

    private static void printPattern1(int i) {
    	for(int j = 1; j <= 5; j++) {
        if (i == 1 || j == 1 || i == 5 || j == 5)
            System.out.print("*");
        else
            System.out.print(" ");
    	}
    }

    private static void printPattern2(int i) {
    	for(int j = 1; j <= 5; j++) {
            if (i == 1 || j == 1 || i == 5 || j == 5)
                System.out.print(i);
            else
                System.out.print(" ");
        	}
    
    }

    private static void printPattern3(int i) {
    	for(int j = 1; j <= 5; j++) {
            if (i == 1 || j == 1 || i == 5 || j == 5)
                System.out.print(j);
            else
                System.out.print(" ");
        	}
    }
}
