import java.util.*;;
public class fibonacci {
    public static void main(String[] args) {
        int n1=0,n2=1;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=s.nextInt();
        System.out.println("Numbers are \n"+n1+ ","+n2);
        for(int i=2;i<=num;++i)
        {
            int n3=n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;
        }

    }
}
