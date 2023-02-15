import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=s.nextInt();
        int m=num/2;
        int flag=0;
        for(int i=2;i<=m;i++)
        {
            if(num%2==0){
            flag=1;
            break;
            }
            else 
            flag=0;
        }
        if(flag==0)
        System.out.println("Prime number");
        else
        System.out.println("Not a prime number");
        }
    }

