import java.util.Scanner;
class attendance{
   public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      String[]name={"Ali","Yoga","Raj","Heman","Niven"};
      boolean[]present=new boolean[name.length];
      System.out.println("     Attendance Class    ");
      for(int i=0;i<name.length;i++){
         System.out.print(name[i]+ " present? (true/false): ");
         present[i]=sc.nextBoolean();
      }
      String absent="";
      for(int i=0;i<name.length;i++){
         if (present[i]==false){
            absent=name[i];
            System.out.println("Today absent is " +absent);
         }
      } 
   }
}     