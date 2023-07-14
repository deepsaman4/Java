import java.util.*;


public class New {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("welcome to customer service");
        System.out.println("press E for english");
        System.out.println("press F for french");
        char input =sc.next().charAt(0);
        switch(input){
            case 'E' :
                System.out.println("welcome");
                System.out.println("press 1 for reception desk");
                System.out.println("press 2 for hr department");
                int extension=sc.nextInt();
                switch(extension){
                    case 1:
                        System.out.println("welcome to reception desk");
                        break;
                    case 2:
                        System.out.println("welcome to the hr department");
                        break;

                    default:
                        System.err.println("invalid extension");
                }
                break;
            case 'F':
                System.out.println("bonjour");
                System.out.println("press 1 for billing");
                System.out.println("press 2 for conntection inquiry");
                int num=sc.nextInt();
                switch(num){
                    case 1:
                        System.out.println("please stay on line");
                        break;
                    case 2:
                        System.out.println("please wait");
                        break;
                }

        }


    }
}
