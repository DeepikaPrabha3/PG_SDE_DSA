package ProblemSolving;

import java.util.Scanner;

public class FilledDiamondPattern {
    public static void main(String[] args) {
        //write your answer here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char c = '*';
        int i=1;
        int j;
        while(i<=n)
        {
            j=1;
            while(j++<=n-i)
            {
                System.out.print(" ");
            }
            j=1;
            while(j++<=i)
            {
                System.out.print(c);
                System.out.print(" ");
            }
            System.out.println();
            i++;
        }
        i=n-1;
        while(i>0)
        {
            j=1;
            while(j++<=n-i)
            {
                System.out.print(" ");
            }
            j=1;
            while(j++<=i)
            {
                System.out.print(c);
                System.out.print(" ");
            }
            System.out.println();
            i--;
        }
    }
}
