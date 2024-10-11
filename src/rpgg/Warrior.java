package rpgg;

import java.util.ArrayList;
import java.util.List;

import monster.Monster;

public class Warrior extends Character{
	private int skillnum;
	public Warrior(String name) {
		super(name, 100, 20, 5,100,30);
	}
	
	
	@Override
	public void attack(Monster monster) {
		int dmg = super.getAttack() - monster.getDefense();
		
		if(dmg > 0) {
			monster.takeDamge(dmg);
			System.out.println(super.getName() + "은 "+monster.getName() + " 에게 " + dmg + "데미지를 입혔다!" + monster.getName()+"남은체력:" +monster.getHp());
		}else {
			System.out.println(super.getName() + "은 데미지를 입히지못했다!");
		}
	}
	
	@Override
	public void grow(int exe) {
		super.setExp(super.getExp()+ exe);
		int lev = super.getLevel();
		int requireExp = (int) (10 * Math.pow(2, super.getLevel() -1));
		System.out.println("rexp  "+requireExp);
		System.out.println("exp  "+super.getExp());

		while(requireExp <= super.getExp()) {
			super.setExp(super.getExp()- requireExp);
			
			System.out.println("레벨업!!!");
			super.setLevel(super.getLevel()+1);
			super.setMaxHp(super.getMaxHp()+5);
			super.setHp(super.getMaxHp());
			super.setAttack(super.getAttack()+5);
			super.setDef(super.getDef()+1);
			
			
			requireExp = (int) (10 * Math.pow(2, super.getLevel() -1));
		}
		
	}
	
	public void getSkill() {
		List<Character> getSkill = new ArrayList<Character>();
		
		if(super.getLevel() == 2) {
//			getSkill.add("방어태세",2);
		}
	}


	@Override
	public void useSkill() {
		
		
	}
	
}
