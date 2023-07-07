public class Increment {
    public static void main(String[] args) {
        int i=6;
        int j=8;
        int k=10;
       if(i>=8 || j>=8){
           System.out.println(i);
       } if(j<=5 && k<=8){
           System.out.println("invalid value of i");
       } if(j>=8 && k<=10){
           System.out.println("you are good to go");
        }else{
           System.out.println("try again");
       }
    }
}
