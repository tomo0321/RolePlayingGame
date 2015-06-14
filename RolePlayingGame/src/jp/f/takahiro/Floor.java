package jp.f.takahiro;

import java.util.ArrayList;

import jp.f.tomoyuki.Human;
import jp.f.tomoyuki.Monster;

/**
 * ダンジョン内のフロアを表すクラス．
 *
 * @author OkuboTakahiro
 *
 */
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

	/**
	 * このフロアで行動する．
	 *
	 * @param party
	 *            パーティ
	 */
	public void action(ArrayList<Human> party) {
		// 戦闘（仕様未定）
		for (Monster enemy : monsterList) {
			// ButtleManagerで戦闘処理
			// ButtleManager.buttle(party, enemy);
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((monsterList == null) ? 0 : monsterList.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Floor other = (Floor) obj;
		if (monsterList == null) {
			if (other.monsterList != null) {
				return false;
			}
		} else if (!monsterList.equals(other.monsterList)) {
			return false;
		}
		return true;
	}
}
