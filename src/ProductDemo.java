import java.util.Scanner;
public class ProductDemo {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Product ID: ");
    int id=sc.nextInt();
    System.out.print("Enter Product Name: ");
    String name=sc.next();
    System.out.print("Enter Product Price: ");
    double price=sc.nextDouble();

    Product p=new Product();
    p.setProductDetails(id,name,price);
    System.out.println(p);
    p.calculateDiscount();
sc.close();

    }
}
class Product{
    private int id;
    private  String name;
    private  double price;
     public void setProductDetails( int id,String name,double price){
         this.id=id;
         this.name=name;
         this.price=price;
     }
     public void calculateDiscount(){
         double discount;
         if(price<1000){
             discount=price*0.05;
         }
         else if(price<=5000){
             discount=price*0.10;
         }
         else{
             discount=price*0.15;
         }
         double finalPrice=price-discount;
         System.out.println("Discount Amount: "+discount);
         System.out.println("Price After Discount: "+finalPrice);
     }

    @Override
    public String toString() {
        return String.format("Product[ProductId=%d, Name='%s', Price='%s']",id,name,price);
    }
}
