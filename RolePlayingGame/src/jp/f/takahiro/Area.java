package jp.f.takahiro;

import java.util.ArrayList;

import jp.f.tomoyuki.Human;

public abstract class Area {
	private String areaName;

	// エリアで何らかの行動をする
	public abstract void action(ArrayList<Human> party);

	// コマンド選択
	public abstract void chooseCommand();

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

}
