import java.util.*;


public class calculater {
    public static void main(String[] array){
        Scanner sc=new Scanner(System.in);
        System.out.println("1.addition");
        System.out.println("2. subtraction");
        System.out.println("3.multiplication");
        System.out.println("4.division");
        System.out.println("enter your input");
        int input=sc.nextInt();
        System.out.println("enter num1");
        int num1=sc.nextInt();
        System.out.println("enter num2");
        int num2=sc.nextInt();
        switch(input){
            case 1:
                System.out.println("addition of"+ num1+ "and" +num2 +"is :" + num1+num2);
                break;
                case 2:
                System.out.println(num1-num2);
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
