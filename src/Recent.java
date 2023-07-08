import java .util.*;



public class Recent {
    public static void main(String[] args) {
Scanner sc =new Scanner (System .in);
int a=sc.nextInt();
int b=sc.nextInt();
int n=sc.nextInt();
if(n==1){
    System.out.println(a+b);
} else if (n==2){
    System.out.println(a-b);
} else if (n==3){
    System.out.println(a*b);
} else if (n==4){
    System.out.println(a/b);
} else if (n==5){
    System.out.println(a%b);
} else {
    System.err.println("invalid n");
}

    }
}
