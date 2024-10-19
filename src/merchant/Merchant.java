package merchant;

import java.util.List;

public class Merchant {
	private int itemPrice;
	private String itemName;
	private int itemNum;
	private String itemEx;
	private int itemStock = 1;
	public Merchant( String itemName,int itemPrice, int itemNum,String itemEx,int itemStock) {
		this.itemPrice = itemPrice;
		this.itemName = itemName;
		this.itemNum = itemNum;
		this.itemEx = itemEx;
		this.itemStock = itemStock;
	}
	@Override
	public String toString() {
		return "[아이템 명](" + itemName + ")  [아이템 가격](" + itemPrice + ") [아이템 번호](" + itemNum + ") [효과] ("
				+ itemEx + ")";
	}
	public int getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemNum() {
		return itemNum;
	}
	public void setItemNum(int itemNum) {
		this.itemNum = itemNum;
	}
	public String getItemEx() {
		return itemEx;
	}
	public void setItemEx(String itemEx) {
		this.itemEx = itemEx;
	}
	public int getItemStock() {
		return itemStock;
	}
	public void setItemStock(int itemStock) {
		this.itemStock = itemStock;
	}
	
	
}
