import java.util.Scanner;

public class ReverseDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter digit : ");
        int x = input.nextInt();

        int reverse = Reverse(x);

        System.out.print("Reverse number are : "+reverse);


    }

    public static int Reverse(int num){
        int ans = 0;
        while(num > 0)
        {
            int digit = num % 10;
             ans = ans * 10 + digit;
            num = num /10;
        }
        return ans;
    }
}
