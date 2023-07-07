import java.util.* ;


public class Scannerclass {
    public static void main(String[] array){
    Scanner sc=new Scanner(System.in);
    float i=sc.nextFloat();
   float j=sc.nextFloat();
    float k=sc.nextFloat();
    if(i>=8 || j>=8){
        System.out.println(i);
    } if(j<=5 && k<=8){
        System.out.println("invalid value of i");
    } if(j>=8 && k<=10){
        System.out.println("you are good to go");
    }else{
        System.out.println("try again");
    }

   String name=sc.nextLine();
    System.out.println(name);



}
}