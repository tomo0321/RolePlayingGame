package jp.f.tomoyuki;

public class Human extends Charactor {

	public Human(int hp, String name, int level, int power, int defence, int exp){
		super(hp, name, level, power, defence, exp);
	}
	//逃げるメソッド
		public void run(){
			System.out.println("逃げ出した");
		}

}
