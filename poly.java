
public class poly {
    public static void add(int num1,int num2){
       int res=num1+num2;
       System.out.println(res);
    }
    public static void add(int num1,Double num2){
        double res=num1+num2;
        System.out.println(res);
     }public static void add(Double num1,Double num2){
        double res=num1+num2;
        System.out.println(res);
     }
     public static void add(Double num1,int num2){
        double res=num1+num2;
        System.out.println(res);
     }
     public static void main(String[] args) {
        poly rv1=new poly();
        rv1.add(14.5,2);
     }
}

