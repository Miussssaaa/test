package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		//Heroを20人格納するリストを作成
		List<Hero> list = new ArrayList();

		for(int i = 0; i <= 20; i++) {
			//リストにインスタンス生成したHero追加
			list.add(new Hero("ななし" + i + "号"));
		}

		System.out.println(list);


		//①Heroのうち一人をHP0にする
		list.get(3).setHP(0);


		//②Heroのうち一人でもHP0がいたらtrueになるboolean

		//StreamとanyMatchを使うと一行で書ける
		//配列やList、Collectionなどのオブジェクト名.stream().メソッド名((引数) -> {処理})
		//「Stream API」とは配列やList、Collectionなどの要素の集合に対して処理を行う
		//anyMatch 引数に記述したラムダ式に対してtrue か falseを返却する
		boolean isKnockOut = list.stream().anyMatch(h -> h.getHP() == 0);
		System.out.println(isKnockOut);

		//StreamAPIの初期化(インスタンス生成のようなもの)
		//ジェネリクスは同じ型を使用する
		Stream<Hero> st = list.stream();


		//繰り返し
		list.forEach(h ->{

			System.out.println("勇者の名前 : " + h.getName());

		});


/*		boolean isKnockOut = false; //HP0がいるか
		String KnockOutHero = "不在"; //HP0の名前


		//全要素アクセス
		for(Hero h : list) {

			//HP0だった場合
			if(h.getHP() == 0) {
				KnockOutHero = h.getName(); //倒れたヒーローの名前
				isKnockOut = true; //倒れているにチェック
			}

		}

		System.out.println("倒れたヒーローの有無 : " + isKnockOut);
		System.out.println("倒れたヒーロー : " + KnockOutHero);
*/


	}

}
