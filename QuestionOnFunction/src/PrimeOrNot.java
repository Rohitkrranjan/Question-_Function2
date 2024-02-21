import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int a = input.nextInt();
         boolean prime = IsPrime(a);
        if(prime)
       {
            System.out.print("given number is prime number");
        }
        else
            System.out.print("Not a prime number");
    }

    public static boolean IsPrime(int num)
    {
        int i=2;
        while(i<num)
        {
            if(num % i == 0)
            {
                return false;
            }
            i++;
        }
        return true;
    }
}
