package burgerapp.burgerapp.Menu;

public class Menu {
	private String itemCodenum;
	private String itemType;
	private String itemName;
	private Integer itemPrice;

	public String getItemCodenum() {
		return itemCodenum;
	}

	public void setItemCodenum(String itemCodenum) {
		this.itemCodenum = itemCodenum;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Integer getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(Integer itemPrice) {
		this.itemPrice = itemPrice;
	}

	public Menu(String itemCodenum, String itemType, String itemName, Integer itemPrice) {
		super();
		this.itemCodenum = itemCodenum;
		this.itemType = itemType;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
	}
}
