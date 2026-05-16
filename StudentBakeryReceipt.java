import java.util.Scanner;
class StudentBakeryReceipt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] itemNames = new String[100];
        double[] price = new double[100];
        int count = 0; 
        char addMore = 'y';
        char Member;
        double total = 0, discount, tax, subTotal, grandTotal, cash, change;
        System.out.print("Buy item? (y/n): ");
        addMore = sc.next().charAt(0);
        while (addMore != 'n' && count < 100) {
            System.out.print("Enter item name: ");
            itemNames[count] = sc.next();            
            System.out.print("Enter price per unit (RM): ");
            price[count] = sc.nextDouble();           
            total = total + price[count];
            count = count + 1;
            System.out.print("Add another item? (y/n): ");
            addMore = sc.next().charAt(0);
        }
        if (count ==0)
            System.out.println("Invalid Output ");
        System.out.print("\nIs the customer a Rewards Member? (y/n): ");
        Member = sc.next().charAt(0);
        if (Member == 'y') 
            discount = total * 0.10;
          else if (total > 150) 
            discount = total * 0.05;
          else 
            discount = 0;
        subTotal = total - discount;
        tax = subTotal * 0.06;
        grandTotal = subTotal + tax;
        System.out.println("\n------------------------------------");
        System.out.printf("Total Amount to Pay: RM %.2f", grandTotal);
        System.out.print("\nEnter cash received: RM ");
        cash = sc.nextDouble();
        change = cash - grandTotal;
        System.out.println("\n====================================");
        System.out.println("          STUDENT BAKERY         ");
        System.out.println("====================================");
        System.out.println("Items Purchased:");
        for (int i = 0; i < count; i++) {
            System.out.printf("%-15s   : RM   %7.2f\n", itemNames[i], price[i]);
        }        
        System.out.println("------------------------------------");
        System.out.printf("Total Items Price : RM\t\t%.2f\n", total);
        System.out.printf("Discount Given    : RM\t\t%.2f\n", discount);
        System.out.printf("SST (6%%)          : RM\t\t%.2f\n", tax);
        System.out.println("------------------------------------");
        System.out.printf("GRAND TOTAL       : RM\t\t%.2f\n", grandTotal);
        System.out.printf("Cash Paid         : RM\t\t%.2f\n", cash);
        System.out.printf("Change            : RM\t\t%.2f\n", change);
        System.out.println("====================================");
        System.out.println("\nThank you! Please come again. ");
    }
}