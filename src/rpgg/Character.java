package rpgg;

import monster.Monster;

public abstract class Character {
	public String name;
	public int hp;
	public int attack;
	public int def;
	public int level;
	public int exp;
	public int maxHp;
	
	public Character(String name,int hp,int attack, int def , int maxhp) {
		this.name = name;
		this.hp = hp;
		this.attack = attack;
		this.def = def;
		this.level = 1;
		this.exp = 0;
		this.maxHp = maxhp;

	}
	public void attack(Monster monster) {
		int dmg = this.attack - monster.getDefense();
		
		if(dmg > 0) {
			monster.takeDamge(dmg);
			System.out.println(name + "은 "+monster.getName() + " 에게 " + dmg + "데미지를 입혔다!" + name+"남은체력:" +hp);
		}else {
			System.out.println(name + "은 데미지를 입히지못했다!");
		}
	}
	
	public void grow(int exe) {
		this.exp += exe;
		int lev = this.level;
		int requireExp = (int) (10 * Math.pow(2, level -1));
		System.out.println("rexp  "+requireExp);
		System.out.println("exp  "+exp);
//		if (requireExp >= exe) {
//			exp -= requireExp;
//			
//			System.out.println("레벨업!!!");
//
//			level++;
//			hp = maxHp;
//
//		}
// if문은 경험치 음수로 출력되는 문제가생김  필요경험치가 현재 경험치보다 값이 더높아서 발생함
		while(requireExp <= exe) {
			exp -= requireExp;
			
			System.out.println("레벨업!!!");
			level++;
			hp = maxHp;
			
			requireExp = (int) (10 * Math.pow(2, level -1));
		}
		
	}

}
