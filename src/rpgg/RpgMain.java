package rpgg;

import java.util.List;
import java.util.Scanner;

import monster.Monster;
import monster.Slime;
import monster.Goblin;

public class RpgMain {

	public static void start() {
		Monster[] monsteridx = {new Slime(),new Goblin()};
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("당신의 캐릭터이름을 입력해주세요 enter > ");
		String name = scanner.nextLine();
		
		Character player = new Warrior(name);
		
		while(player.hp >0) {
			
			int spawnMonster = (int)(Math.random() * monsteridx.length);
			Monster monster = monsteridx[spawnMonster];
			System.out.println(name+" 은(는)"+"야생의 "+ monster.name +"만났다!");
			
			while(monster.hp >0) {
				System.out.println("1)공격 2)스킬");
				int ch = scanner.nextInt();
				
				if(ch == 1) {
					player.attack(monster);
				}else if(ch == 2) {
					System.out.println("아직 미구현입니다");
				}
				
				
				if(monster.hp > 0 && ch != 2) {
					monster.attack(player);
				}
				
				if(monster.hp <=0) {
					player.grow(monster.takeexe);
					System.out.println(monster.name + "은 죽었다" + " 현재경험치 : " + player.exp);
				}
			}
			monsteridx[spawnMonster].hp = monsteridx[spawnMonster].maxHp;
		}

	}
	
	public static void main(String[] args) {
		RpgMain game = new RpgMain();
		game.start();
	}
}
