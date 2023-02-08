import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number whose factorial to be found");
        int number=sc.nextInt();
        int fact=1;
        for(int i=1;i<=number;i++)
        fact=fact*i;
        System.out.println("Factorial of " +number+ " is "+fact);
    }
}
