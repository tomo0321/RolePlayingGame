package jp.f.takahiro;

import java.util.ArrayList;

import jp.f.tomoyuki.Human;

/**
 * ダンジョンエリア．
 *
 * @author OkuboTakahiro
 *
 */
public class Dungeon extends Area {
	private ArrayList<Floor> floors; // フロアリスト

	public Dungeon(String areaName, Floor floor) {
		super(areaName);
		floors = new ArrayList<Floor>();
		floors.add(floor);
	}

	public Dungeon(String areaName, ArrayList<Floor> floors) {
		super(areaName);
		this.floors = floors;
	}

	public ArrayList<Floor> getFloors() {
		return floors;
	}

	@Override
	public void action(ArrayList<Human> party) {
		// TODO 自動生成されたメソッド・スタブ
		// ダンジョンでの行動

		System.out.println("ここはダンジョン[" + getAreaName() + "]です．");

		for (int i = 0; i < floors.size(); i++) {
			System.out.println("現在[" + (i + 1) + "階]です．");

			floors.get(i).action(party);

			// 最終フロアをクリアするか，諦めた場合は，ループを抜ける
		}
	}

	@Override
	public void chooseCommand() {
		// TODO 自動生成されたメソッド・スタブ

	}
}
