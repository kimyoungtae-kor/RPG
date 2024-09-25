package rpgg;

public class Testmain {
	public static void main(String[] args) {
		int i = 1;
		// 1 2 3 4 5
		// 10 20 40 80 160
		System.out.println((int) (10 * Math.pow(2, i - 1)));
		Testmain main = new Testmain();
		main.exe(10);
		main.exe(10);
		System.out.println(main.level);
	}

	int level = 1;
	int exp;

	public void exe(int exe) {
		this.exp += exe;
		int 요구경험치 = (int) (10 * Math.pow(2, level - 1));
		System.out.println(level + ", " + this.exp);
		
		if (요구경험치 >= exe) {
			this.exp += 요구경험치;
			System.out.println("레벨업!!!");
			level++;
		}
	}
}
