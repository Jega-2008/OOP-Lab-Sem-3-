import java.util.Scanner;

class ElectricityBill {
    int consumerNo;
    String consumerName;
    int units;
    double amount;

    // Method to calculate electricity bill
    void calculateBill() {
        if (units <= 100) {
            amount = units * 1.50;
        }
        else if (units <= 200) {
            amount = 100 * 1.50 + (units - 100) * 2.50;
        }
        else if (units <= 500) {
            amount = 100 * 1.50 + 100 * 2.50
                   + (units - 200) * 4.00;
        }
        else {
            amount = 100 * 1.50 + 100 * 2.50
                   + 300 * 4.00
                   + (units - 500) * 6.00;
        }
    }

    // Method to display bill
    void displayBill() {
        System.out.println("\n========== ELECTRICITY BILL ==========");
        System.out.println("Consumer Number : " + consumerNo);
        System.out.println("Consumer Name   : " + consumerName);
        System.out.println("Units Consumed  : " + units);
        System.out.println("Total Amount    : Rs." + amount);
        System.out.println("=======================================");
    }
}

public class ElectricityBillDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ElectricityBill bill = new ElectricityBill();

        System.out.print("Enter Consumer Number: ");
        bill.consumerNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Consumer Name: ");
        bill.consumerName = sc.nextLine();

        System.out.print("Enter Units Consumed: ");
        bill.units = sc.nextInt();

        bill.calculateBill();
        bill.displayBill();

        sc.close();
    }
}
