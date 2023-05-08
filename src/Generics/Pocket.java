package Generics;

import java.util.ArrayList;

//				    ↓ジェネリクス(仮型引数)　一度型を入れるとその型以外入れられなくなる
//				  　  <>に入れた型に全部変換される
public class Pocket<E> {

	//データ格納用変数
	private E data;

	//代入するときのメソッド
	public void put(E d) {
		this.data = d;
	}

	//値を取得するときのメソッド
	public E get() {
		return this.data;
	}

	ArrayList<E> list = new ArrayList();
}
