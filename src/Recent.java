import java .util.*;



public class Recent {
    public static void main(String[] args) {
        System.out.println("welcome to calculator");
Scanner sc =new Scanner (System .in);
        System.out.println("Press 1 for addition");
        System.out.println("press 2 for subtraction");
        System.out.println("press 3 for multiplication");
        System.out.println("press 4 for division");
        System.out.println("Press 5 for modulo");
        System.out.println(" Please enter input");
        int input =sc.nextInt();
        System.out.println("enter num1");
        int num1=sc.nextInt();
        System.out.println("Enter num2");
int num2=sc.nextInt();

if(input==1){
    System.out.println(num1+num2);
} else if (input==2){
    System.out.println(num1-num2);
} else if (input==3){
    System.out.println(num1*num2);
} else if (input==4){
    System.out.println(num1/num2);
} else if (input==5){
    System.out.println(num1%num2);
} else {
    System.err.println("invalid input");
}

    }
}
