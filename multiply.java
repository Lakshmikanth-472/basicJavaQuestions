import java.util.Scanner;

public class multiply {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the 2 numbers");
    int num1=s.nextInt();
    int num2=s.nextInt();
    int sum=0;
    for(int i=1;i<=num1;i++)
    {
        sum=sum+num2;
    }
    System.out.println("Product is "+sum);
    }
}
