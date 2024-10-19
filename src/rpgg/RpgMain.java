package rpgg;

import java.util.List;
import java.util.Scanner;

import merchant.Merchant;
import merchant.WarriorItemList1;
import monster.Monster;
import monster.L1monsterSpawn;
import monster.L2monsterSpawn;
import rpgg.RpgUtils;
import skill.SkillList;
import rpgg.Warrior;

public class RpgMain {

	public static void start() {
		L1monsterSpawn spawnMonster = new L1monsterSpawn();
		L2monsterSpawn spawnMonster2 = new L2monsterSpawn();
		WarriorItemList1 warriorItemList1 = new WarriorItemList1();
		
		Merchant merchant;
		
		int monsterClear = 0;

		//String name = RpgUtils.next("당신의 캐릭터이름을 입력해주세요",String.class,x -> x.length() > 0 && x.length()<=5,"이름은 1~5글자 입력해주세요.");
		
		Character player = new Warrior("김용태");
		
		while(player.getHp() >0) {
			Monster monster;
			int turn = 1;
			
			if(player.getLevel()>1) {
				monster = spawnMonster2.createMonster();
			}else {
				monster = spawnMonster.createMonster();
			}

			System.out.println("김용태"+" 은(는)"+"야생의 "+ monster.name +"만났다!");
			
			while(monster.hp >0) {
				
				if(turn % 2 == 1) {
					
			
					int ch = RpgUtils.next("1)공격 2)스킬",Integer.class,x -> x>0&&x<3,"1~2번만 선택해주세요.");
					
					if(ch == 1) {
						player.attack(monster);
					}else if(ch == 2) {
						int ch2 = RpgUtils.next("1)스킬목록 보기 2)스킬사용하기 3)일반 공격하기",Integer.class,x -> x>0&&x<4,"1~3번만 선택해주세요.");
						if(ch2 == 1) {
							player.printSkills();
							turn = 0;
						}else if(ch2 == 2) {
							player.useSkill(monster);
							if(player.getNoSkill() == false) {
								turn = 0;
							}
						}
					}
				}else if(turn % 2 == 0){
					System.out.println(monster.name + "의 턴입니다!");
						monster.attack(player);
					
				}
				if(turn % 2 == 1) {
					RpgUtils.next("다음 턴으로 진행하려면 엔터 키를 누르세요.", String.class);
				}

				turn++;
				if(monster.hp <=0) {
					player.grow(monster.takeexe);
					System.out.println(monster.name + "은 죽었다" + " 현재경험치 : " + player.getExp());
				}else if(player.getHp() <=0) {
					System.out.println(player.getName() + "은(는) 죽었습니다 게임을 종료합니다");
					return;
				}
			}
			monster.hp = monster.maxHp;
			player.setMp(player.getMaxMp());
		}

	}
	
	public static void main(String[] args) {
		RpgMain game = new RpgMain();
		game.start();
	}
}
