import java.util.*;


public class Calculator {
    public static void main(String[] array){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Calculator");
        System.out.println(" Press 1 for addition");
        System.out.println("Press 2 for subtraction");
        System.out.println("Press 3 for multiplication");
        System.out.println("Press 4 for division");
        System.out.println("Enter your input");
        int input=sc.nextInt();
        System.out.println("Enter num1");
        int num1=sc.nextInt();
        System.out.println("Enter num2");
        int num2=sc.nextInt();
        switch(input){
            case 1:
                System.out.println("addition of"+ num1+ "and" +num2 +"is :" + num1+num2);
                break;
                case 2:
                System.out.println( num1-num2);
                break ;
            case 3 :
                System.out.println(num1*num2);
                break;
            case 4:
                System.out.println(num1/num2);
                break;
            default :
                System.err.println("invalid input");
        }
    }
}
