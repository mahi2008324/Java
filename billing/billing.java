import java.util.Scanner;
public class billing {
    static int pizza = 200;
    static int cgst = 18;
    static int sgst = 9;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of pizzas you want to order: ");
        int quantity = sc.nextInt();
        int discount = 0;
        if (quantity <= 0) {
            System.out.println("Invalid quantity. Please enter a positive number.");
            sc.close();
            return;
        }
        else if (quantity < 5) {
            discount = 0;
        }
        else if (quantity >= 5 && quantity <= 10) {
            discount = 10; // 10% discount
        }
        else if (quantity > 10 && quantity < 20) {
            discount = 20; // 20% discount
        }
        else {
            discount = 30; // 30% discount
        }
        int pizzacost = quantity * pizza;
        int discountAmount = pizzacost * discount / 100;
        int totalCost = pizzacost - discountAmount;
        int sgstCost = totalCost * sgst / 100;
        int cgstCost = totalCost * cgst / 100;
        int finalAmount = totalCost + sgstCost + cgstCost;
        System.out.println("----PIZZA HUT----");
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + totalCost);
        System.out.println("SGST: " + sgstCost);
        System.out.println("CGST: " + cgstCost);
        System.out.println("Discount: " + discountAmount);
        System.out.println("----------------------------------");
        System.out.println("Final Amount: " + finalAmount);
        System.out.println("----------------------------------");
        System.out.println("Thank you for ordering with us!");
        sc.close();
    }
}
