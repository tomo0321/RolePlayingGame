package jp.f.takahiro;

import java.util.ArrayList;

import jp.f.tomoyuki.Human;

/**
 * エリアを表す抽象クラス．
 *
 * @author OkuboTakahiro
 *
 */
public abstract class Area {
	private String areaName;

	public Area() {
		areaName = "";
	}

	public Area(String areaName) {
		this.areaName = areaName;
	}

	/**
	 * このエリアで行動する．
	 *
	 * @param party
	 *            パーティ
	 */
	public abstract void action(ArrayList<Human> party);

	/**
	 * コマンド選択．
	 */
	public abstract void chooseCommand();

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

}
