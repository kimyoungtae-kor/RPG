package monster;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class L2monsterSpawn {
	public Monster createMonster() {
		List<Monster> monsters = new ArrayList<>();
		monsters.add(new Monster("오크", 80, 15, 5, 20));
	    monsters.add(new Monster("드래곤", 200, 30, 10, 50));
	    Collections.shuffle(monsters);
	    return monsters.get(0);
	}
}
