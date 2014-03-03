package p1;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * Uses the Item class to create items and add them to a shopping
 * cart stored in an ArrayList.
 * @author Jessica Tekenos set 1C
 *
 */
public class Shop {

    public static void main (String[] args ) {
        
        Item item = null;
        String itemName;
        double itemPrice;
        double totalPrice = 0;
        int quantity;
        ArrayList<String> cart = new ArrayList<String>();
        
        Scanner scan = new Scanner(System.in);
        
        String keepShopping = "y";
        
        do
        {
            System.out.print ("Enter the name of the item: ");
            itemName = scan.nextLine();
            
            System.out.print ("Enter the unit price: ");
            itemPrice = scan.nextDouble();
            
            System.out.print ("Enter the quantity: ");
            quantity = scan.nextInt();
            
            item = new Item(itemName, itemPrice, quantity);
            totalPrice += item.getQuantity() * item.getPrice();
            
            System.out.print("Continue Shopping? (y/n) ");
            scan.nextLine();
            keepShopping = scan.nextLine();
            
            cart.add(itemName);
            System.out.println(cart);
            System.out.println("Total price: " + totalPrice);
            
        }
        while (keepShopping.equals("y"));        
        scan.close();
    }
}
