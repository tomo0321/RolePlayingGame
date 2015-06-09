package jp.f.tomoyuki;

public class Hero extends Human {

	public Hero(int hp, String name, int level, int power, int defence, int exp){
		super(hp, name, level, power, defence, exp);
	}

	//レベル計算式
	public int LevelUp(){
		int level = (int) (Math.pow( (getExp()+1), 0.3415621565 )+9);//レベル=（累積経験値＋１）＾０．３４１５６２１５６５＋９
		return level;
	}

	@Override
	public String toString(){
		String temp = "勇者「" + getName() + "」" +"\nLevel：" + getLevel() +  "\tHP：" + getHp() + "\t攻撃力:" + getPower() ;
		return temp;
	}
}
