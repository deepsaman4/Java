import java.util.*;


public class Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char input;
        do {
            System.out.println("please enter the num1");
            int num1 = sc.nextInt();
            System.out.println("please enter num2");
            int num2 = sc.nextInt();
            System.out.println("please enter num3");
            int num3 = sc.nextInt();
            if (num1 > num2 && num1 > num3) {
                System.out.println("num1 is the greatest");
            } else if (num2 > num3) {
                System.out.println("num2 is the greatest");

            } else if (num1 == num2 && num2 == num3) {
                System.out.println("equal");
            } else {
                System.out.println("num3 is the greatest");
            }
            System.out.println("do you want to continue,y: yes ,n:no");
             input =sc.next().charAt(0);
        }while(input=='y');
    }
}