/**
 * main
 */
import java.util.*;
public class SimpleCalculator {
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the 2 numbers");
    int firstNum=sc.nextInt();
    int secondNum=sc.nextInt();
    int result;
    System.out.println("Enter the operation to be performed");
    String operator=sc.next();
    switch(operator){
        case "+":result=firstNum+secondNum;
                System.out.println("Sum of"+firstNum+ "and" +secondNum+ "is "+result);
                break;
         case "-":result=firstNum-secondNum;
                System.out.println("Difference of "+firstNum+ "and" +secondNum+ "is "+result);
                break;
         case "*":result=firstNum*secondNum;
                System.out.println("Product of"+firstNum+ "and" +secondNum+"is "+result);
                break;
         case "/":if(secondNum==0)
                    System.out.println("Divide by zero error");
                    else 
                    {
                        result=firstNum/secondNum;
                        System.out.println("Quotient of"+firstNum+ "and" +secondNum+"is "+result);
                    }
                break;
        
    }
    }

    
}