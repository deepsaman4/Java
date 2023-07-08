import java .util.*;



public class Practice {
    public static void main (String [] array){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age<16){
            System.out.println("do not drive");
        }else if(age>=16 && age<=18){
            System.out.println("take alearner license");
        }else if(age>=18)
        {
            System.out.println("eligible for driving license");
        }

        }



    }

