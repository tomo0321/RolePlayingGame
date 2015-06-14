package jp.f.takahiro;

import java.util.ArrayList;

import jp.f.tomoyuki.Human;

/**
 * RPGの世界を表すクラス．
 *
 * @author OkuboTakahiro
 *
 */
public class World {
	private Area currentArea; // 現在のエリア
	private ArrayList<Human> party; // パーティ

	/**
	 * 現在のエリアを返す．
	 *
	 * @return 現在のエリア
	 */
	public Area getCurrentArea() {
		return currentArea;
	}

	/**
	 * パーティを返す．
	 *
	 * @return パーティ
	 */
	public ArrayList<Human> getParty() {
		return party;
	}

	/**
	 * コンストラクタ．
	 *
	 * @param initialArea
	 *            初期エリア
	 * @param shujinko
	 *            主人公
	 */
	public World(Area initialArea, Human shujinko) {
		// TODO 自動生成されたコンストラクター・スタブ
		// 初期エリア
		currentArea = initialArea;
		// 初期パーティは主人公だけ
		party = new ArrayList<Human>();
		party.add(shujinko);
	}

	/**
	 * 行動する．
	 */
	public void action() {
		currentArea.action(this.party);
	}

	/**
	 * 次のエリアへ移動する．
	 *
	 * @param nextArea
	 *            次のエリア
	 */
	public void move(Area nextArea) {
		System.out.println(nextArea.getAreaName() + "に移動します");
		currentArea = nextArea;
	}

	/**
	 * 仲間を追加する．
	 *
	 * @param nakama
	 *            新しい仲間
	 */
	public void addPartyMember(Human friend) {
		System.out.println(friend.getName() + "が仲間になりました");
		party.add(friend);
	}
}
