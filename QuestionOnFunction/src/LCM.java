import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter first number : ");
        int a = input.nextInt();
        System.out.print("Please enter second number : ");
        int b = input.nextInt();
        int lcm = Find_LCM(a,b);
        System.out.print("LCM of two number is : "+lcm);

    }

    public static int Find_LCM(int a,int b)
    {
        int i=1;
        while(true)
        {
            int factor = a*i;
            if(factor % b == 0)
            {
                return factor;
            }
            i++;
        }

    }
}