public class GroceryBill {
    public static void main(String[] args) {

        double item1 = 50.00;
        double item2 = 75.00;
        double item3 = 100.00;

        double total = item1 + item2 + item3;
        double tax = total * 0.12;
        double finalTotal = total + tax;

        System.out.println("Item 1: " + item1);
        System.out.println("Item 2: " + item2);
        System.out.println("Item 3: " + item3);
        System.out.println("Total: " + total);
        System.out.println("Tax (12%): " + tax);
        System.out.println("Final Total: " + finalTotal);
    }
}
