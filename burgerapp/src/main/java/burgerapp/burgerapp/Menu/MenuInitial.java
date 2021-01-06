package burgerapp.burgerapp.Menu;


import java.util.ArrayList;


public class MenuInitial implements MenuInterface{
ArrayList<Menu> itemObject = new ArrayList<Menu>();
	
	public MenuInitial() {
		
		itemObject.add(new Menu("i1","Desert","tres leches",5));
		itemObject.add(new Menu("i2","MAIN COURSE","Chicken Burger", 12));
		itemObject.add(new Menu("i3","Desert","kulfi", 6));
		itemObject.add(new Menu("i4","MAIN COURSE","MAC AND CHEESE", 12));
		itemObject.add(new Menu("i5","Entre","FRIES", 8));
		itemObject.add(new Menu("i6","SPECIAL","Lamb And HAMBURGER", 13));
		itemObject.add(new Menu("i7","COMBO","Lamb And HAMBURGER with coke", 15));
		itemObject.add(new Menu("i8","DESSERT","OREO SHAKE", 7));
		
	}

	public ArrayList<Menu> getitemObject() {
		return itemObject;
	}


	public void addingtheItem(String itemCodenum, String itemType, String itemName, Integer itemPrice) {
		
		this.itemObject.add(new Menu(itemCodenum,itemType,itemName,itemPrice));
		
	}


	public void editingtheItem(String itemCodenum, Integer itemPrice) {
		
		for(Menu menu: itemObject) {
			
			if(itemCodenum.equals(menu.getItemCodenum())) {
				menu.setItemPrice(itemPrice);
				break;
			}
			
		}
		
	}

	public void removingtheItem(String itemCodenum) {
		
		for(Menu menu : itemObject) {
			
			if(itemCodenum.equals(menu.getItemCodenum())) {
				itemObject.remove(menu);
				break;
			}
		}
		
	}

	
}

