import java.util.*;


public class CharacterDemo {
    public static void main(String[] args) {
        System.out.println("welcome to Calculator");
        Scanner sc=new Scanner(System.in);
        System.out.println("+ for addition");
        System.out.println("- for subtraction");
        System.out.println("* for multiplication");
        System.out.println("/ for division");
        System.out.println("% for modulo");
        System.out.println("enter ch of your choice");
        char ch=sc.next().charAt(0);
        System.out.println("enter num1");
        int num1=sc.nextInt();
        System.out.println("enter num2");
        int num2=sc.nextInt();
        switch (ch){
            case '+':
                System.out.println( num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            case '%':
                System.out.println(num1%num2);
                break;
            default:
                System.err.println("invalid ch");
        }


    }
}
