package rpgg;

import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.util.List;

import monster.Monster;
import skill.SkillList;

public class Warrior extends Character{
	private int skillnum = 1;
	private List<SkillList> skills;
	public Warrior(String name) {
		super(name, 100, 20, 5,100,30);
		this.skills = new ArrayList<>();
	}
	
	
	@Override
	public void attack(Monster monster) {
		int dmg = super.getAttack() - monster.getDefense();
		
		if(dmg > 0) {
			monster.takeDamge(dmg);
			System.out.println(super.getName() + "은 "+monster.getName() + " 에게 " + dmg + "데미지를 입혔다!" + monster.getName()+"남은체력:" +monster.getHp());
		}else {
			System.out.println(super.getName() + "은 데미지를 입히지못했다!");
		}
	}
	
	@Override
	public void grow(int exe) {
		super.setExp(super.getExp()+ exe);
		int lev = super.getLevel();
		int requireExp = (int) (10 * Math.pow(2, super.getLevel() -1));
		System.out.println("rexp  "+requireExp);
		System.out.println("exp  "+super.getExp());

		while(requireExp <= super.getExp()) {
			super.setExp(super.getExp()- requireExp);
			super.setLevel(super.getLevel()+1);
			System.out.println("레벨업!!!");
			System.out.println(super.getLevel());
			learnSkills();
			super.setLevel(super.getLevel()+1);
			super.setMaxHp(super.getMaxHp()+5);
			super.setHp(super.getMaxHp());
			super.setAttack(super.getAttack()+5);
			super.setDef(super.getDef()+1);

			
			
			requireExp = (int) (10 * Math.pow(2, super.getLevel() -1));
		}
		
	}
	


	public void learnSkills() {
		if (super.getLevel() == 2) {
			skills.add(new SkillList(skillnum, "전사의 함성", 30));
			System.out.println("새로운 스킬을 배웠습니다: 전사의 함성");
			skillnum++;
		}
	}
	@Override
	public void printSkills() {
		for(SkillList AAA : skills) {
			System.out.println("=============스킬목록=================");
			System.out.println(AAA);
		}
	}



	@Override
	public void useSkill(Monster target) {
		SkillList skillselect = findSkillNum(RpgUtils.next("사용할 스킬번호를 입력해주세요",Integer.class,x -> findSkillNum(x) != null,"배운적없는 스킬번호입니다"));

		System.out.println(skillselect);

		
		if(skillselect.getSkillName() == "전사의 함성") {
			super.setHp(super.getHp() + 30);
			System.out.println(super.getName() + "은(는) 전사의 함성을 사용했다! 체력이 30 회복됩니다 현재체력: "+super.getHp());
		}
		
	}
	
	
	public SkillList findSkillNum(int skillIdx) {
		SkillList skillList = null;
		for(int i = 0 ; i<skills.size();i++) {
			if(skills.get(i).getSkillNum() == skillIdx) {
				skillList = skills.get(i);
			}
		}
		return skillList;
	}


	

	
}
