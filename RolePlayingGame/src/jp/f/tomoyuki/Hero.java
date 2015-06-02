package jp.f.tomoyuki;

public class Hero extends Human {

	public Hero(int hp, String name, int level, int power, int defence, int exp){
		super(hp, name, level, power, defence, exp);
	}


	@Override
	public String toString(){
		String temp = "勇者「" + getName() + "」" +"\nLevel：" + getLevel() +  "\tHP：" + getHp() + "\t攻撃力:" + getPower() ;
		return temp;
	}
}
