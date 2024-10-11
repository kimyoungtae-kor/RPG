package rpgg;

import java.util.List;
import java.util.Scanner;

import monster.Monster;
import monster.Slime;
import monster.Goblin;
import monster.L1monsterSpawn;
import rpgg.RpgUtils;

public class RpgMain {

	public static void start() {
		L1monsterSpawn spawnMonster = new L1monsterSpawn();
		
		String name = RpgUtils.next("당신의 캐릭터이름을 입력해주세요",String.class,x -> x.length() > 0 && x.length()<=5,"이름은 1~5글자 입력해주세요.");
		
		Character player = new Warrior(name);
		
		while(player.getHp() >0) {
			
			int turn = 1;
			Monster monster = spawnMonster.getRandomMonster();
			System.out.println(name+" 은(는)"+"야생의 "+ monster.name +"만났다!");
			
			while(monster.hp >0) {
				if(turn % 2 == 1) {
					
			
					int ch = RpgUtils.next("1)공격 2)스킬",Integer.class,x -> x>0&&x<3,"1~2번만 선택해주세요.");
					
					if(ch == 1) {
						player.attack(monster);
					}else if(ch == 2) {
						System.out.println("아직 미구현입니다");
					}
				}else {
					System.out.println(monster.name + "의 턴입니다!");
						monster.attack(player);
					
				}
				if(monster.hp >0) {
					RpgUtils.next("다음 턴으로 진행하려면 엔터 키를 누르세요.", String.class);
				}
				
				turn++;
				if(monster.hp <=0) {
					player.grow(monster.takeexe);
					System.out.println(monster.name + "은 죽었다" + " 현재경험치 : " + player.getExp());
				}
			}
			monster.hp = monster.maxHp;
		}

	}
	
	public static void main(String[] args) {
		RpgMain game = new RpgMain();
		game.start();
	}
}
