import java.util.*;

public class Table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        int i=1;
        System.out.println("please enter integer");
        num=sc.nextInt();
        do{

            System.out.println( num + "*" + i  + "= " + num*i);
            i++;
        }while(i<21);

        i=1;
        num=sc.nextInt();
        while(i<21){
            System.out.println(   num*i);
            i++;
        }

       num=sc.nextInt();
        for(i=0;i<21;i++){
            System.out.println( num*i);
        }

        System.out.println("java");
        System.out.println("hello");
    }
}
