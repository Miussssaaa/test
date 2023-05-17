package MethodObject;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {

	//第一級オブジェクト
	//・変数に代入可能
	//・引数に設定可能
	//・実行中に生成可能

	//メソッドは関数の一種


	//文字数を出力
	public static Integer len(String s){
		return s.length();
	}

	public static void main(String[] args) {


		//Functionは様々な処理を1つにまとめて、名前をつけることができるもの
		//関数を引数に代入
		Function<String,Integer>func = Main::len;
		//		 ↑引数  戻り値		   クラス名::メソッド名


		//戻り値なしver
		//Consumerは消費者という意味 中にsysoutが格納されている
		Consumer<String>cons = System.out::println;

		//引数を受け取るだけで返す値はない
		cons.accept("特級オブジェクト");


		//引数なしver
		//Supplierは提供者という意味 中に改行コードを格納
		Supplier<String>sup = System::lineSeparator;

		//引数を受け取らず改行コードのみ出力
		cons.accept("一行目" + sup.get() + "二行目");


		//引数2つver(システム情報表示)
		//BiFunction<引数,引数,戻り値>
		BiFunction<String,String,String> bFunc = System::getProperty;

		cons.accept(bFunc.apply("java.version", "keyが正しくありません"));



		//文字数格納用変数
		int length = func.apply("特級オブジェクト");

		System.out.println(length);

	}

}
