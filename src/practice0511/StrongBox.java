package practice0511;

import java.util.Optional;

public class StrongBox <E>{

	private E e; //表示する文字列 この場合「開いた」を出力
	private KeyType key; //鍵の種類
	private int count; //回数


	//鍵の種類を受け取るコンストラクタ
	public StrongBox(KeyType key) {
		this.key = key;
	}

	//文字列を代入するメソッド
	public void put(E e) {
		this.e = e;
	}

	//getterメソッド
	public KeyType getKetType() {
		return this.key;
	}


	//null安全性を考慮したメソッドにするため(returnでofNullable()を使う)Optional<E>で宣言
	public Optional<E> get() {

		this.count++;

		//戻り値で渡す時の値を保存
		E ret = e;


		//switch文で分岐
		switch(this.key) {

		case PADLOCK:
			ret = NumCheck(5); //必要な試行回数　回数を満たせばnull(空)でなく「開いた」が代入される
			break;

		case BUTTON:
			ret = NumCheck(10);
			break;

		case DIAL:
			ret = NumCheck(15);
			break;

		case FINGER:
			ret = NumCheck(20);
			break;

		}

		//returnで返す(ofNullableを入れることでエラーを出さないようにする)
		//NumCheckで回数条件を満たしていると判定されれば中身「開いた」が入っている
		return Optional.ofNullable(ret);

	}


	//回数を満たしているか確認するメソッド
	private E NumCheck(int need) {

		//戻り値を渡すときの変数
		//putで設定したメッセージ「開いた」を代入
		E ret = e;

		//設定した開錠回数と現在の回数を比較する
		//条件を満たしていなければnullを返し「開かない」ことになる
		if(this.count < need) {
			ret = null;
		}

		//if文の失敗条件に引っかからなければ、そのまま「開いた」メッセージを持って戻る
		return ret;

	}
}
