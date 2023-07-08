import java.util.*;

public class CustomerCare {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("welcome to customer care services");
        System.out.println("Press E for English ");
        System.out.println("Press F  for French ");
        System.out.println( "Enter input for preferred language");
        char input=sc.next().charAt(0);
        switch(input){
            case 'E':
                System.out.println("Welcome");
                System.out.println("Please dial extension");

                System.out.println("Press 1 for billing inquiry");
                System.out.println("Press 2 for connection issue");
                System.out.println(" please Enter input");
                int n=sc.nextInt();
                switch(n){
                    case 1:

                        System.out.println("Thanks for reaching billing department,we will in touch with you soon");
                break;
                    case 2:
                        System.out.println("please stay on line");
                        break;
                    default:
                        System.err.println("oops !try again!");
                }
                break;
            case  'F':
                System.out.println("bonjour");
                System.out.println("Please dial extension");
                System.out.println("press 3 for general inquiries");
                System.out.println("press 4 for payment inquires");
                n=sc.nextInt();
                switch(n){
                    case 3:
                        System.out.println("how may i help you ");
                        break;
                    case 4:
                        System.out.println("may i know your mobile number, please");
                        int number=sc.nextInt();
                        System.out.println("i will be in touch with you soon");
                        break;
                    default:
                        System.err.println("oops ! try again");
                }
                break;
            default:
                System.err.println("invalid input");




        }

    }
}
