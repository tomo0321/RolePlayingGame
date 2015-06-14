package jp.f.hiromu.CollectionTest;

import java.util.ArrayList;

/**
 * ArrayListクラスを使用するサンプルプログラム
 *
 * ArrayListは、不定数の要素を配列で扱いたい時に使用するコレクションクラス. <br>
 * 配列数を気にせず要素を追加したり、挿入、削除もできる。 <br>
 * サンプルではString型のListを作成しているが、自作クラスでも作成可能 <br>
 *
 * @author h-yamashita
 *
 */

public class ArrayListTest {

	public static void main(String[] args) {

		/*
		 * Stringを格納するArrayListを作成する場合、ArrayList宣言の次に、
		 * <String>が必要。これを「ジェネリスク」という。
		 */
		ArrayList<String> arrayList = new ArrayList<String>();

		// 配列の要素数を気にせず、要素を追加することができる.
		arrayList.add("aaa");
		arrayList.add("bbb");
		arrayList.add(null);
		arrayList.add("ccc");

		// 要素数、中身を表示.
		System.out.println("Size: " + arrayList.size());
		System.out.println(" 中身：" + arrayList);

		// ２番目に、"ddd"を挿入.
		arrayList.add(1, "ddd");
		System.out.println(" 挿入後：" + arrayList);

		// 4番目のnullを削除
		arrayList.remove(3);
		System.out.println(" 削除後：" + arrayList);

		// 3番目の文字列を取得.
		String tmp = arrayList.get(2);
		System.out.println(" 取得：" + tmp);

		// リスト内に,tmpと同じ文字列があるか判定し、
		// trueなら４番目の文字列を"eee"に置き換える.
		if (arrayList.contains(tmp)) {
			arrayList.set(3, "eee");
		}
		System.out.println(" 置換後：" + arrayList);

		// 普通の配列として取得
		String[] list = (String[]) arrayList.toArray(new String[0]);
		for (String str : list) {
			System.out.println(str);
		}

	}

}
