package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
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


		System.out.println("");


		/* Optional
		 * null以外の値が含まれている場合も含まれていない場合もある
		 * 値が存在する場合、isPresent()はtrueを返し、get()は値を返します。
		 * 含まれる値の有無に応じて追加メソッドが提供されます。
		 * たとえば、orElse() (値が存在しない場合にデフォルト値を返す)
		 * ifPresent() (値が存在する場合にコードのブロックを実行する)など。
		 */


		//最初の要素を取得(Null安全性考慮)
		Optional<Hero> op1 = list.stream().findFirst();

		//中身が空かどうか確認
		if(op1.isPresent()) {
			System.out.println("最初の要素 : " + op1.get().getName());
		}

		//最大値を格納している要素
		list.get(12).setHP(50);

		//listに格納されている最大の要素を取得
		Optional<Hero> op2 = list.stream().max((h1,h2) -> h1.getHP() - h2.getHP());

		//中身が空かどうか確認
		if(op2.isPresent()) {
			System.out.println("HP最大の要素 : " + op2.get().getName());
		}

		System.out.println("");


//===================================================================================



		//勇者の名前を格納したリストを作成
		//①listから取得する（新規インスタンス生成しない）
		//②HPが5の勇者からのみ取得する
		//③最大3人に限定する

		list.get(2).setHP(5);
		list.get(3).setHP(5);
		list.get(4).setHP(5);


		//String型の可変長配列(勇者名を代入する配列
		List<String> heroName = new ArrayList();

		for(Hero h : list) { //拡張for文

			//HPが5の場合
			if(h.getHP() == 5) {
				heroName.add(h.getName()); //可変長配列に該当する勇者の名前を追加

				//可変長配列の大きさが3以上の場合処理を終了
				if(heroName.size() >= 3) {
					break;
				}
			}
		}

		System.out.println(heroName); //勇者の名前を全部出力



//============================================================================

		//省略記法



		List<String> heroName2 = list.stream()

		//条件から抽出する(HPが5の勇者)
		.filter(h -> h.getHP() == 5)

		//抽出上限を決める (3つまで)
		.limit(3)

		//格納する値を決める(勇者の名前)
		.map(h -> h.getName())

		//List<↑で格納した値の型>にキャスト (型変換)
		.collect(Collectors.toList()) ;


		heroName2.forEach(name ->{

			System.out.println(name);

		});



	/*
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
		 */


	}

}
