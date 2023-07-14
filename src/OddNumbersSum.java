import java.util.*;


public class OddNumbersSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int sum=0;
        int num=sc.nextInt();
        int i=1;
        for(i=0;i<num;i++){
            if(i%2==0){
                continue;
            }
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
