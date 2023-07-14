import java.util.*;
public class GreatestNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        char input;
        do{
            System.out.println("please enter num1");
            int num1=sc.nextInt();
            System.out.println("please enter num2");
            int num2=sc.nextInt();
            System.out.println("please enter num3");
            int num3=sc.nextInt();
            if(num1>num2 &&num1>num3){
                System.out.println(num1 +"is greatest" + " than"+ num2 + "and " +num3);
            } else if (num2>num3){
                System.out.println(num2 + "is greatest than" + num1 + "and" +num3);
            }else if (num1==num2 && num2==num3){
                System.out.println(num1 +"," +num2 +"and" +num3 +" are equal");
            }else {
                System.out.println(num3 + "is greatest than "+ num1 +"and" +num2);
            }
            System.out.println("do you want to continue ? y :yes ,n:no");
          input =sc.next().charAt(0);}while(input=='y');

        System.out.println("thanks ");
    }


}
