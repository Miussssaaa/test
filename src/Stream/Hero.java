package Stream;

import java.util.Objects;

public class Hero implements Comparable<Hero> , Cloneable{

	//カプセル化
	private String name;
	private int hp;


	//コンストラクタ
	public Hero(String name) {
		this.name = name;
	}

	//getterメソッド
	public String getName() {
		return this.name;
	}

	public int getHP() {
		return this.hp;
	}


	//setterメソッド
	public void setName(String name) {
		this.name = name;
	}

	public void setHP(int hp) {
		this.hp = hp;
	}


	//ハッシュ値を計算する
	public int HashCode() {
		return Objects.hash(this.name);
	}


	//等価か判定するメソッド (クラス違いでエラーを出さないために引数をobjectにしておく)
	public boolean equals(Object obj) {

		//早期リターン
		if(this == obj) { return true; }
		if(this == null) { return false; }


		//型変換が安全かどうかチェック
		if(obj instanceof Hero) {

			//引数をobject型からHero型に変換(ダウンキャスト)
			Hero h = (Hero)obj;

			//引数で渡された変数と名前が同じ時
			if(this.name.equals(h.name)) {
				return true;
			}
		}

		//それ以外はfalse
		return false;

	}


	public int compareTo(Hero h) {

		if(this.hp < h.hp) { //相手の値が大きい場合
			return -1;
		}else if(this.hp == h.hp) {//自分の値が大きい場合
			return 1;
		}else {  //値が等しい場合
			return 0;
		}

	}


	//複製
	public Hero Clone() {

		Hero h = new Hero(this.name);

		//フィールドのコピー
		h.name = this.name;
		h.hp = this.hp;
		//h.sword = this.sword;

		return h;

	}


	public String toString() {
		return "勇者の名前 : " + this.name;
	}


}