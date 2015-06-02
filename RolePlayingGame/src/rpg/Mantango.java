package rpg;

public class Mantango {
	private int hp;
	private String name;
	private int level;
	private int power;

	//レベル1のおばけキノコのコンストラクタ
	public Mantango(String name) {
		this.hp = 5;
		this.name = name;
		this.level = 1;
		this.power = 2;
	}

	//攻撃を与えるメソッド
	public int attack(){
		System.out.println(name + "は攻撃を行った！");
		int damage = power;
		return damage;
	}
	//ダメージを受けるメソッド
	public void damage(int damage){
		int tempHp = getHp();
		System.out.println(name + "は" + damage +  "の攻撃を受けた");
		setHp(tempHp -=damage);
	}



	@Override
	public String toString() {
		return  name + "が現れた！";
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}


}
