package skill;

public class SkillList {
	private int skillNum;
	private String skillName;
	private int manaRequired;
	
	public SkillList(int skillNum, String skillName,int manaRequired) {
		this.skillNum = skillNum;
		this.skillName = skillName;
		this.manaRequired = manaRequired;
	}
	
	public int getSkillNum() {
		return skillNum;
	}
	public void setSkillNum(int skillNum) {
		this.skillNum = skillNum;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	public int getManaRequired() {
		return manaRequired;
	}

	public void setManaRequired(int manaRequired) {
		this.manaRequired = manaRequired;
	}

	@Override
	public String toString() {
		return "[" + skillNum + "] " + skillName + "(필요마나 : "+manaRequired+")";
	}

	
	
}
