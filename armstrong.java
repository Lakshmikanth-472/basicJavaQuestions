import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=s.nextInt();
        int temp=num,rem,sum=0;
        while(num>0)
        {
            rem=num%10;
            sum=(rem*rem*rem)+sum;
            num=num/10;
        }
        if(temp==sum)
        System.out.println("Armstrong number");
        else
        System.out.println("Not and Armstrong number");
}
}