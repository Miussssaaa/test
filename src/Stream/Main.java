package Stream;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		//Heroを20人格納するリストを作成
		List<Hero> list = new ArrayList();

		for(int i = 0; i < 20; i++) {
			//リストにインスタンス生成したHero追加
			list.add(new Hero("ななし" + i + "号"));
		}

		System.out.println(list);


		//①Heroのうち一人をHP0にする
		list.get(3).setHP(0);


		//②Heroのうち一人でもHP0がいたらtrueになるboolean

		boolean isKnockOut = false; //HP0がいるか
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


	}

}
