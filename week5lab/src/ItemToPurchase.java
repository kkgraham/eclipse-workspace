public class ItemToPurchase {
   //Private fields - itemName, itemPrice, and itemQuanity
	private String itemName;
	private int itemPrice;
	private int itemQuantity;
	

   //default constructor
	public ItemToPurchase() {
		super();
		this.itemName = "none";
		this.itemPrice = 0;
		this.itemQuantity = 0;
	}
    
   //public member methods (mutators & accessories)
	
   
   //setName() & getName()
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
   
	//setPrice() & getPrice() 
	public int getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}
   
	//setQuantity() & getQuantity() 
	public int getItemQuantity() {
		return itemQuantity;
	}
	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
   
	//print item to purchase
   public void printItemPurchase() {
      System.out.println(itemQuantity + " " + itemName + " $" + itemPrice +  
                         " = $" + (itemPrice * itemQuantity));
   }


}
