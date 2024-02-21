import java.util.Scanner;

public class RightPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int n = input.nextInt();
        Left_Pattern(n);


    }

    public static void Left_Pattern(int num)
    {
       int row , col;
       for(row=1 ; row<=num;row++)
       {
           for(col=1;col<=row;col++)
           {
               System.out.print("*");
           }
           System.out.println();
       }


    }
}
