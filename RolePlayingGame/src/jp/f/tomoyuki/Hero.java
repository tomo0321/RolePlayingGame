package jp.f.tomoyuki;

public class Hero extends Human {

	public Hero() {
		// TODO 自動生成されたコンストラクター・スタブ
	}


	@Override
	public String toString(){
		String temp = "勇者「" + getName() + "」" +"\nLevel：" + getLevel() +  "\tHP：" + getHp() + "\t攻撃力:" + getPower() ;
		return temp;
	}
}
