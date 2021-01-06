package burgerapp.burgerapp.Menu;

public interface MenuInterface {

	public void addingtheItem(String itemCodenum, String itemType, String itemName, Integer itemPrice);
	public void editingtheItem(String itemCodenum, Integer itemPrice);
	public void removingtheItem(String itemCodenum);

}
