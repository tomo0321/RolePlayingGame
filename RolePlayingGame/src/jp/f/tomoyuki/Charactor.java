package jp.f.tomoyuki;

public class Charactor {

	private int hp; //HP
	private String name; //名前
	private int level; //レベル
	private int power; //攻撃力
	private int defence; //防御力
	private int exp; //経験値

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
	public int getDefence() {
		return defence;
	}
	public void setDefence(int defence) {
		this.defence = defence;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}


}
