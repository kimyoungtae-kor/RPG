package monster;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class L1monsterSpawn{
	
	public Monster createMonster(){
		List<Monster> monsters = new ArrayList<>();
		monsters.add(new Monster("슬라임", 50, 10, 2,45));
		monsters.add(new Monster("고블린", 50, 15, 5,50));
		Collections.shuffle(monsters);
		return monsters.get(0);
	}
	
}
