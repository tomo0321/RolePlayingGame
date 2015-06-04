package jp.f.takahiro;

import java.util.ArrayList;

import jp.f.tomoyuki.Monster;

public class Floor {
	private ArrayList<Monster> monsterList;

	public Floor() {
		monsterList = new ArrayList<Monster>();
	}

	public Floor(ArrayList<Monster> monsterList) {
		this.monsterList = monsterList;
	}

	public ArrayList<Monster> getMonsterList() {
		return monsterList;
	}
}
