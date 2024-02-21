import java.util.Scanner;

public class LeftPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int n = input.nextInt();
        Left_Pattern(n);

    }

    public static void Left_Pattern(int num){
        for(int row = 1;row<=num ;row++)
        {
            for(int col = 1;col<=num+1-row;col++)
            {
                System.out.print("&");
            }
            System.out.println(" ");
        }
    }
}
