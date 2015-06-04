package jp.f.takahiro;

import java.util.ArrayList;

import jp.f.tomoyuki.Human;

public class World {
	private Area currentArea; // 現在のエリア
	private ArrayList<Human> party; // パーティ

	public Area getCurrentArea() {
		return currentArea;
	}

	public ArrayList<Human> getParty() {
		return party;
	}

	public World(Area initialArea, Human shujinko) {
		// TODO 自動生成されたコンストラクター・スタブ
		// 初期エリア
		currentArea = initialArea;
		// 初期パーティは主人公だけ
		party = new ArrayList<Human>();
		party.add(shujinko);
	}

	// 行動
	public void action() {
		currentArea.action();
	}

	// エリア移動
	public void move(Area nextArea) {
		System.out.println(nextArea.getAreaName() + "に移動します");
		currentArea = nextArea;
	}

	// 仲間追加
	public void addMember(Human nakama) {
		System.out.println(nakama.getName() + "が仲間になりました");
		party.add(nakama);
	}
}
