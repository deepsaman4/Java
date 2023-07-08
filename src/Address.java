import java.util.*;



public class Address {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("pragra = address of pragra");
        System.out.println("CN tower= address of CN tower");
        System.out.println("park =address of park");
        System.out.println("enter your input");
        String input=sc.nextLine();
        switch(input){
            case "pragra":
                System.out.println("address of " + input + " is :" + "mississuaga");
                break;
            case "CN tower":
                System.out.println("address of "+ input+" is :"+ "toronto");
                break;
            case "park":
                System.out.println("address of "+ input + " is :"+ "brampton");
                break;
            default :
                System.err.println("invalid input");

        }


    }
}
