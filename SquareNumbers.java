import java.util.Scanner;

public class SquareNumbers {
    public static void main(String[] args) {
        // Create a Scanner object for user input
   int a; int count;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        count=sc.nextInt();
        System.out.print("enter the maximum number to square:");
for(int i=0;i>=a;i++)
{
count=i++ * count;
        }
        
        System.out.print("the square is "+ count);
    }
    }
    
