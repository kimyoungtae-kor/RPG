package Skill;

import monster.Monster;
import rpgg.Character;
public class Skill {
	private String name;
	private int power;
	private int cost;
	private boolean pORa;
	public int noSkill;
	
	public Skill(String name, int power,int cost,boolean pORa) {
		this.name = name;
		this.power = power;
		this.cost = cost;
		this.pORa = pORa;
	}
	
	public void skillA(Character user,Monster target) {
		if(user.getMp() >= cost) {
			user.setMp(user.getMp()-cost);
			target.takeDamge(power);
			System.out.println(user.getName() + "은" + target.getName() + "에게 " + name + "을 시전" + power + " 스킬 데미지를 입혔다");
		}else {
			noSkill = 1;
			System.out.println("MP가 부족합니다!");
		}
	}
	
}
