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
			if(num.getItemNum() == 1) {
				System.out.println("BF대검을 구입하셨습니다! 기존 공격력 :"+player.getAttack());
				player.setAttack(player.getAttack() + 10);
				System.out.println("현재 공격력 :"+player.getAttack());
			}
			else if(num.getItemNum() == 2) {
				System.out.println("쇠사슬갑옷을 구입하셨습니다!기존 방어력 :"+player.getDef() );
				player.setDef(player.getDef()+5);
				System.out.println("현재 방어력 :"+player.getDef());
			}
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
	
	public void helloMerchant(Character player) {
		System.out.println("======상인======");
		while(true) {
			int input = RpgUtils.next("1) 물건을 살펴본다 2)물건을 구입한다 3)휴식을 취한다(50골드) 4) 무시한다",Integer.class,i -> i>0 && i<5,"1~3번까지 입력해주새요");
			switch (input) {
				case 1:
					printItem();
					break;
				case 2:
					buyItem(player);
					break;
				case 3:
					if(player.getGold()>=50){
						player.setGold(player.getGold()-50);
						player.setHp(player.getMaxHp());
					}else {
						System.out.println("보유금액이 부족합니다");
					}
					break;
				case 4:
					return;
				default :
					System.out.println("잘못된 입력입니다. 다시 시도해주세요.");
	                break;
			
			}
			
		}
		
	}
	
	
}
