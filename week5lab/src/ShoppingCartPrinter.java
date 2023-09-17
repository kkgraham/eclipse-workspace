import java.util.Scanner;

public class ShoppingCartPrinter {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int i = 0;
      String productName = "none";
      int productPrice = 0;
      int productQuantity = 0;
      int cartTotal = 0;
  
      ItemToPurchase item1 = new ItemToPurchase();
      ItemToPurchase item2 = new ItemToPurchase();

      
      // Get item 1 details from user, create itemToPurchase object
      System.out.println("Item 1");
      System.out.println("Enter the item name: ");
      productName = scnr.nextLine();
      
      System.out.println("Enter the item price: ");
      productPrice = scnr.nextInt();
      
      System.out.println("Enter the item quantity: ");
      productQuantity = scnr.nextInt();
      
      item1.setItemName(productName);
      item1.setItemPrice(productPrice);
      item1.setItemQuantity(productQuantity);
      
      scnr.nextLine();
      System.out.println("");
      
 
      // Get item 2 details from user, create itemToPurchase object
      System.out.println("Item 2");
      System.out.println("Enter the item name: ");
      productName = scnr.nextLine();
      
      System.out.println("Enter the item price: ");
      productPrice = scnr.nextInt();
      
      System.out.println("Enter the item quantity: ");
      productQuantity = scnr.nextInt();
      
      item2.setItemName(productName);
      item2.setItemPrice(productPrice);
      item2.setItemQuantity(productQuantity);
      
      System.out.println("");
      
      // Add costs of two items and print total
      item1.printItemPurchase();
      item2.printItemPurchase();
      
      
      // cartTotal = item one price + item two price
      cartTotal = (item1.getItemPrice() * item1.getItemQuantity()) + (item2.getItemPrice() * item2.getItemQuantity());
      System.out.println("");
      
      // Total Cost
      System.out.print("Total: $");
      System.out.println(cartTotal);

      return;
   }
}