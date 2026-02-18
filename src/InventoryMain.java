import java.util.Scanner;
public class InventoryMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Item Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Price Per Unit: ");
        double price = sc.nextDouble();
        System.out.print("Enter Quantity In Stock: ");
        int qty = sc.nextInt();
        sc.nextLine();
        Inventory item = new Inventory(name, price, qty);
        item.displayDetails();

        System.out.print("Any updation in Stock Price OR Quantity: ");
        String update = sc.nextLine();
        System.out.println("Any updation in Stock Price OR Quantity: " + update);

        System.out.println();

        if (update.equalsIgnoreCase("YES") || update.equalsIgnoreCase("Y")) {
            System.out.println("Enter new Price Per Unit:");
            double newPrice = sc.nextDouble();
            item.setPricePerUnit(newPrice);

            System.out.println("Enter new Quantity in Stock:");
            int newQty = sc.nextInt();
            item.setQuantityInStock(newQty);
            sc.nextLine();

            System.out.printf("Updated Price Per Unit: %.1f%n", item.getPricePerUnit());
            System.out.printf("Updated Quantity in Stock: %d%n", item.getQuantityInStock());
            System.out.printf("Total Inventory Value: %.2f%n", item.calculateTotalValue());
        } else {
            System.exit(0);
        }
        sc.close();
    }
}
class Inventory{
    private String itemName;
    private double pricePerUnit;
    private  int quantityInStock;

    public Inventory(String itemName, double pricePerUnit, int quantityInStock) {
        this.itemName = itemName;
        this.pricePerUnit = pricePerUnit;
        this.quantityInStock = quantityInStock;
    }
    public String getItemName(){
        return itemName;
    }
    public void setItemName(String itemName){
        this.itemName = itemName;
    }
    public double getPricePerUnit(){
        return pricePerUnit;
    }
    public void setPricePerUnit(double pricePerUnit){
        this.pricePerUnit = pricePerUnit;
    }
    public int getQuantityInStock(){
        return quantityInStock;
    }
    public void setQuantityInStock(int quantityInStock){
        this.quantityInStock = quantityInStock;
    }
    public double calculateTotalValue(){
        return pricePerUnit * quantityInStock;
    }
    public void displayDetails() {
        System.out.printf("Inventory Item Details:%n");
        System.out.printf("Item Name: %s%n", itemName);
        System.out.printf("Price Per Unit: %.1f%n", pricePerUnit);
        System.out.printf("Quantity in Stock: %d%n", quantityInStock);
        System.out.printf("Total Inventory Value: %.2f%n", calculateTotalValue());
    }
}
