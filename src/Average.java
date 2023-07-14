import java.util.*;


public class Average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int i=1;
        do {

            int numbers = sc.nextInt();
            sum=sum+numbers;
i++;


        }while(i<=5) ;
        System.out.println(sum);
        double average=(double)sum/5;
        System.out.println(average);
        System.out.println("java");
        int a=0;
        int b=9;
    }
}
