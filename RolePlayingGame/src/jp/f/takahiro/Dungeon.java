package jp.f.takahiro;


public class Dungeon extends Area {
	private Floor currentFloor; // 現在のフロア

	public Dungeon() {
		currentFloor = new Floor();
	}

	public Floor getCurrentFloor() {
		return currentFloor;
	}

	@Override
	public void action() {
		// TODO 自動生成されたメソッド・スタブ
		// ダンジョンでの行動

	}

}
