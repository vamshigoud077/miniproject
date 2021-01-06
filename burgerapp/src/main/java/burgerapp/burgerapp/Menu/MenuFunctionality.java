package burgerapp.burgerapp.Menu;


import java.util.Scanner;

public class MenuFunctionality {
	Scanner scan =  new Scanner(System.in);
	MenuInitial menuinitial;
	
	public MenuFunctionality() {
		this.menuinitial = new MenuInitial();
	}
	
	public void addingtheItem() {
		
		System.out.println("Enter the codenumber of the item: ");
		String itemCodenum = scan.nextLine();
		System.out.println("Enter the type of the item: ");
		String itemType = scan.nextLine();
		System.out.println("Enter the name of the item: ");
		String itemName = scan.nextLine();
		System.out.println("Enter the Price of the item: ");
		Integer itemPrice = scan.nextInt();
	
		
		this.menuinitial.addingtheItem(itemCodenum, itemType, itemName, itemPrice);
		
		System.out.println("Successfully added the Item into the menu ");
			
	}
	
	public void editingtheItem() {
		showtheItems();
		
		System.out.println("Enter the code of the item from the above list: ");
		String itemCodenum = scan.nextLine();
		System.out.println("Enter the Price: ");
		Integer itemPrice = scan.nextInt();
		
		this.menuinitial.editingtheItem(itemCodenum, itemPrice);
		
		System.out.println("Successfully edited the Item in the menu ");
			
	}
	
	public void removingtheItem() {
		
		showtheItems();
		System.out.println("Enter the code of the item from the above list: ");
		String itemCodenum = scan.nextLine();

		this.menuinitial.removingtheItem(itemCodenum);
		
		System.out.println("Item has been removed successfully ");
			
	}
	
	public void showtheItems() {
		
		System.out.println("The list of items are :  ");
		for(Menu menu : this.menuinitial.getitemObject()) {
			
			System.out.println(" *  Code : "+ menu.getItemCodenum() +" , Type : " + menu.getItemType() +" , Name : "
			+ menu.getItemName()+ " , Price : " + menu.getItemPrice());
		
		}
			
	}

}

