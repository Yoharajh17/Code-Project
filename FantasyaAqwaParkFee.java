import java.util.Scanner;
class FantasyaAqwaParkFee{
   public static void main(String[] args){
      Scanner fee = new Scanner(System.in);
      System.out.print("Enter adult entrance fee");
      int num1=fee.nextInt();
      System.out.print("Enter children entrance fee");
      int num2=fee.nextInt();
      System.out.print("Enter how many adults");
      int num3=fee.nextInt();
      System.out.print("Enter how many children");
      int num4=fee.nextInt();
      int total =(num1*num3)+(num2*num4);
      System.out.println("Total: "+ total);
   }
}