package monster;

import rpgg.Character;

public abstract class Monster {
	public String name;
	public int maxHp;
	public int hp;
	public int attackPower;
	public int defense;
	public int takeexe;

	public Monster(String name, int hp, int attackPower, int defense,int takeexe) {
		super();
		this.name = name;
		this.hp = hp;
		maxHp = hp;
		this.attackPower = attackPower;
		this.defense = defense;
		this.takeexe = takeexe;
	}
	
	

	
	public void takeDamge(int damage) {
		this.hp -= damage;
		System.out.println(name + " 에게 " + damage + "데미지를 입혔다!" + name+"남은체력:" + hp);
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
			System.out.println(name + "은"+player.getName()+"에게 " + dmg +"데미지를 입혔다");
		}else {
			System.out.println(name + "은"+player.getName()+"에게 데미지를입히지못햇다");
		}
		
	}
	
}


