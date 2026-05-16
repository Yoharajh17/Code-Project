//Program to search expenses at a specific index
import java.util.Scanner;
class searchexpenses{
   public static void main(String[]args){
      Scanner input = new Scanner(System.in);
      //Declare and Create an array of size 10
      double[] expenses =new double[10];
      double searchKey;
      //Loop to display 10 expenses
      for (int i = 0; i<10; i =i + 1){
         System.out.print((i+1)+ " Enter expenses : RM");
         expenses[i]=input.nextDouble();
      }
      System.out.print("Enter the expenses that you want to search : RM");
      searchKey=input.nextDouble();
      
      double found = 0;
      //Loop to compare all expenses with searchKey
      for (int i = 0; i<10;i = i + 1){
         //Determine the searchKey at which index
         if (searchKey == expenses[i]){
            System.out.print("RM " + expenses[i] +" found at index : " + i +"\n");
            found = found + 1;
         }
      }
      //Approxiamate the expenses is not found
      if (found == 0)
         System.out.print("Expenses is not Found");
   }
}