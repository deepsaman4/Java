import java.util.*;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        int sum=0;
        int i=0;
        num=sc.nextInt();
        do{


            i++;
            sum=sum+i;
        }while(i<num);
        System.out.println(sum);

i=0;
        num=sc.nextInt();
        sum=0;
        while(i<num){
            i++;
            sum=sum+i;
        }
        System.out.println(sum);
        i=0;
        num=sc.nextInt();
        sum=0;
        for(i=1;i<num;i++){
            sum=sum+i;
        }
        System.out.println(sum);



    }


}

