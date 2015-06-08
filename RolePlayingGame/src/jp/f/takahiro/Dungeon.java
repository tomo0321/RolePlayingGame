package jp.f.takahiro;

import java.util.ArrayList;

import jp.f.tomoyuki.Human;

public class Dungeon extends Area {
	private ArrayList<Floor> floors; // フロアリスト
	private int currentFloor; // 現在のフロア

	public Dungeon(Floor floor) {
		floors = new ArrayList<Floor>();
		floors.add(floor);
		currentFloor = 1;
	}

	public Dungeon(ArrayList<Floor> floors) {
		this.floors = floors;
		currentFloor = 1;
	}

	public int getCurrentFloor() {
		return currentFloor;
	}

	public ArrayList<Floor> getFloors() {
		return floors;
	}

	@Override
	public void action(ArrayList<Human> party) {
		// TODO 自動生成されたメソッド・スタブ
		// ダンジョンでの行動

		System.out.println("ここはダンジョンです．");

		while (true) {
			System.out.println("現在[" + currentFloor + "階]です．");

			// このフロアの敵とバトル
			//ButtleManager.buttle(floors.get(currentFloor), party);

			// 最終フロアをクリアするか，諦めた場合は，ループを抜ける
		}
	}

	@Override
	public void chooseCommand() {
		// TODO 自動生成されたメソッド・スタブ

	}
}
