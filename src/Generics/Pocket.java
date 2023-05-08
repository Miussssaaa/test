package Generics;

import java.util.ArrayList;

//				    ↓ジェネリクス(仮型引数)　一度型を入れるとその型以外入れられなくなる
//				  　  <>に入れた型に全部変換される
public class Pocket<E> {

	/*
	 *  仮型引数を使ったクラスをインスタンス生成する場合は、<>内に使う型を指定する
	 *  Eに参照元で指定した型が当てはめられる
	 *
	 *  extendsを入れることで条件を指定できる
	 *  例 : <E extends Character>  Characterクラスを継承している型のみ使用可能 など
	 *
	 *  型の指定がない場合、自動でObject型に変更される
	 *  基本型はNG(参照型のみ)
	 *  コンパイル時に型が判断される
	 *
	 */

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
