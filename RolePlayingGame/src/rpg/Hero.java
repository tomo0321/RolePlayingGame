package rpg;

public class Hero {
	private int hp;
	private String name;
	private int level;
	private int power;

	//Heroクラス コンストラクタ
	Hero(){
		this.power = 2;
		this.hp = 20;
		this.level = 1;
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
		tempHp -= damage;
		System.out.println(name + "の残りHPは" + tempHp);
		setHp(tempHp);
	}




	@Override
	public String toString(){
		String temp = "勇者「" + name + "」" +"\nLevel：" + level +  "\tHP：" + hp + "\t攻撃力:" + power ;
		return temp;
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
	public int getAttack() {
		return power;
	}
	public void setAttack(int attack) {
		this.power = attack;
	}

	/*テスト関数
	public static void main(String[] args) {
		Hero hero = new Hero();
		System.out.println(hero);
	}
	*/
}
