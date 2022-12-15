package ProblemSolving;

import java.util.Scanner;

public class KNumberPattern {
    public static void main(String[] args) {

        //write your answer here
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for (int i = n; i >= 1; i--) {
            //Loop to iterate over each column of the ith row
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        //Printing Lower Half for n-1 rows
        //Loop to iterate over each row
        for (int i = 1; i <= n; i++) {
            //Loop to iterate over each column of the ith row
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
