package MethodObject;

import java.util.function.Function;

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
//				↑引数  戻り値		   クラス名::メソッド名

		//文字数格納用変数
		int length = func.apply("特級オブジェクト");

		System.out.println(length);

	}

}
