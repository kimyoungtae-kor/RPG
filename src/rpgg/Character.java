package rpgg;

import java.util.List;

import monster.Monster;

public abstract class Character {
	private String name;
	private int hp;
	private static int attack;
	private int def;
	private int level = 1;
	private int exp;
	private int maxHp;
	private int mp;
	
	
	public Character(String name,int hp,int attack, int def , int maxhp,int mp) {
		this.name = name;
		this.hp = hp;
		this.attack = attack;
		this.def = def;
		this.exp = 0;
		this.maxHp = maxhp;
		this.mp = mp;
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


	public int getMp() {
		return mp;
	}


	public void setMp(int mp) {
		this.mp = mp;
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
	}
	
	public void grow(int exe) {
		
	}


	protected abstract void printSkills();


	protected void useSkill( Monster target) {
	}


}
