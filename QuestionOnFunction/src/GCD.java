import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter first number : ");
        int a = input.nextInt();
        System.out.print("Please enter second number : ");
        int b = input.nextInt();

        int gcd = GCDOfNumber(a,b);
        System.out.print("ans is : "+ gcd);
    }

    public static int GCDOfNumber(int x,int y){
        int gcd = 1;
        int i=2;
        int least = Least(x,y);
        while (i<=least)
        {
            if(x % i == 0 && y % i == 0)
               gcd = i;
            i++;
        }
        return gcd;
    }

    public static int Least(int num1,int num2){
        if(num1 > num2)
            return num2;
        else
            return num1;
    }
}
