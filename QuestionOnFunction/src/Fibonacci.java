import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter a number : ");
        int x = input.nextInt();

       printFibonacci(x);


    }

    public static void printFibonacci(int num){
        if(num < 0)
            return;
        System.out.print(" 0 ");
        if(num == 1)
            return;
        System.out.print(" 1 ");

        int first =0 ,second = 1;
        while(first + second <= num)
        {
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }

    }
}
