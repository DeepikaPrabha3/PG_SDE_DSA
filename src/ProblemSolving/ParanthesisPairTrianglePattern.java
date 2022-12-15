package ProblemSolving;

import java.util.Scanner;

public class ParanthesisPairTrianglePattern {
    public static void main(String[] args) {

        //write your answer here
        int i,j,n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=i;j>=1;j--)
            {
                if(j%2!=0){
                    for(int k=2;k>=1;k--){
                        System.out.print((char)((k+39)));
                    }
                }
                if(j%2==0){
                    for(int k=1;k<=2;k++){
                        System.out.print((char)((k+39)));
                    }
                }
            }
            System.out.println("");
        }
    }
}
