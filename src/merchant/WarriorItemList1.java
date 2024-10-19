package merchant;

import java.util.ArrayList;
import java.util.List;
import rpgg.*;
import rpgg.Character;

public class WarriorItemList1{
	List<Merchant> itemList = new ArrayList<Merchant>();
	
	
	{
		itemList.add(new Merchant("BF대검",100,1,"일반 공격력을 10 올려줍니다",1));
		itemList.add(new Merchant("쇠사슬갑옷", 40, 2, "방어력이 5 상승합니다",1));
	}
	
	public void printItem() {
		for(Merchant item: itemList) {
			System.out.println(item);
		}
	}
	
	public void buyItem(Character player) {
		Merchant num = findItemNum(RpgUtils.next("물건의 번호를 입력해주세요!",Integer.class,i -> findItemNum(i) != null,"물건의 번호를 다시 입력해주세요")); 
		
		if(player.getGold() >= num.getItemPrice()) {
			player.setGold(player.getGold() - num.getItemPrice());
		}
	}
	
	private Merchant findItemNum(int num) {
		Merchant merchant = null;
		for(int i = 0 ;i < itemList.size();i++) {
			if(itemList.get(i).getItemNum() == num) {
				merchant = itemList.get(i);
			}
		}
		return merchant;
	}
	
	
}
