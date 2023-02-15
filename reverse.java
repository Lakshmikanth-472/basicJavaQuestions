import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=s.nextInt();
        int rem,sum=0;
        while(num>0)
        {
            rem=num%10;
            sum=(sum*10)+rem;
            num=num/10;
        }
        System.out.println("Reverse of the number is "+sum);
}
}
