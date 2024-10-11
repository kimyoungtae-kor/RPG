package monster;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class L1monsterSpawn {
	List<Monster> monsters = new ArrayList<Monster>();
	Slime slime = new Slime();
	Goblin goblin = new Goblin();
	
	{
		monsters.add(slime);
		monsters.add(goblin);
		
	}
	public Monster getRandomMonster() {
		Collections.shuffle(monsters);
		return monsters.get(0);
	}
	
}
