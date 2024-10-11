package rpgg;

import monster.Monster;

public abstract class Character {
	private String name;
	private int hp;
	private int attack;
	private int def;
	private int level;
	private int exp;
	private int maxHp;
	
	public Character(String name,int hp,int attack, int def , int maxhp) {
		this.name = name;
		this.hp = hp;
		this.attack = attack;
		this.def = def;
		this.level = 1;
		this.exp = 0;
		this.maxHp = maxhp;

	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getHp() {
		return hp;
	}


	public void setHp(int hp) {
		this.hp = hp;
	}


	public int getAttack() {
		return attack;
	}


	public void setAttack(int attack) {
		this.attack = attack;
	}


	public int getDef() {
		return def;
	}


	public void setDef(int def) {
		this.def = def;
	}


	public int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		this.level = level;
	}


	public int getExp() {
		return exp;
	}


	public void setExp(int exp) {
		this.exp = exp;
	}


	public int getMaxHp() {
		return maxHp;
	}


	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
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
		while(requireExp <= this.exp) {
			exp -= requireExp;
			
			System.out.println("레벨업!!!");
			level++;
			hp = maxHp;
			
			requireExp = (int) (10 * Math.pow(2, level -1));
		}
		
	}

}
