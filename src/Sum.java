import java.util.*;


public class Sum {
    public static void main(String[] args) {
        int i=1;
        int n;
        Scanner sc=new Scanner(System.in);

        n=sc.nextInt();

       for(i=0;i<n;i++){
           if(i%2==0){
               continue;
           }
           System.out.println(i);
       }

       i=0;
       n=sc.nextInt();
       do{
           i++;
           if(i%2==0){
              continue;
           }
           System.out.println(i);

       }while(i<n);


       i=0;
       n=sc.nextInt();
       while(i<n){
           if(i%2==0){
               continue;
           }
           System.out.println(i);
           i++;
       }

    }
}
