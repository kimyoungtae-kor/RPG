package monster;

import rpgg.Character;

public class Monster {
	public String name;
	public int maxHp;
	public int hp;
	public int attackPower;
	public int defense;
	public int takeexe;
	private int takegold;

	public Monster(String name, int hp, int attackPower, int defense,int takeexe,int takegold) {
		super();
		this.name = name;
		this.hp = hp;
		maxHp = hp;
		this.attackPower = attackPower;
		this.defense = defense;
		this.takeexe = takeexe;
		this.takegold = takegold;
	}
	
	

	
	public void takeDamge(int damage) {
		this.hp -= damage;
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

	public int getMaxHp() {
		return maxHp;
	}




	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}




	public int getTakeexe() {
		return takeexe;
	}




	public void setTakeexe(int takeexe) {
		this.takeexe = takeexe;
	}




	public int getTakegold() {
		return takegold;
	}




	public void setTakegold(int takegold) {
		this.takegold = takegold;
	}




	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAttackPower() {
		return attackPower;
	}

	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}
	
	public void attack(Character player) {
		
		
		int dmg = this.attackPower - player.getDef();
		if(dmg > 0) {
			player.setHp(player.getHp() - dmg);
			System.out.println(name + "은"+player.getName()+"에게 " + dmg +"데미지를 입혔다 " + player.getName()+"남은체력:" +player.getHp());
		}else {
			System.out.println(name + "은"+player.getName()+"에게 데미지를입히지못햇다");
		}
		
	}


	
	
}


