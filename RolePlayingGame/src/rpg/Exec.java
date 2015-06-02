package rpg;

import lib.Input;

public class Exec {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hero hero = new Hero();
		playGameFirst(hero);
		while(chouse() == 1 || hero.getHp() > 0){
			Mantango mantango = new Mantango("おばけキノコ");
			System.out.println(mantango);
			while(mantango.getHp() > 0){
				mantango.damage(hero.attack());
				if(mantango.getHp()>0){
					hero.damage(mantango.attack());
				}
			}
			System.out.println(mantango.getName() + "を倒した");
		}
	}

	//始まり，名前と乗法表示メソッド
	public static void playGameFirst(Hero hero){
		hero.setName( Input.getString("勇者の名前を入力してください") );
		System.out.println(hero);
		System.out.println("が誕生した！");
	}

	public static int chouse(){
		String sentakusi = "以下の選択肢から選んで下さい"+"\n" + "1：探索" + "\t" + "2：辞める";
		int setntaku = Input.getInt(sentakusi);
		return setntaku;
	}
}
