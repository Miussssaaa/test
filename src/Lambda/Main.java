package Lambda;

import java.util.Date;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.Supplier;

public class Main {


	//引数2つ
	//aとbの合計を出力する
	public static int add(int a,int b) {
		return a+b;
	}

	public static void main(String[] args) {

		//ラムダ式 : その場で関数を作る (実行された瞬間から作られる)
		//メソッドとやることが同じ(オブジェクト指向かの違い)


		/*
		 	ラムダ式構文 :  ( 引数 ) -> { 処理 }

		 	【引数】
		  	() -> { 処理 }  // 引数が0個の場合
			(str) -> { 処理 ]  // 引数が1個の場合
			str -> { 処理 }  // 引数が1個の場合は括弧の省略可
			(str, n) -> { 処理 }  // 引数が2個の場合

			【処理】
			( 引数 ) -> System.out.println(str)  // 処理が一文の場合、returnも波括弧も不要

			( 引数 ) -> {    // 波括弧を使って複数の処理文を記述
    			System.out.println(str);
    			return n;   // 戻り値が必要な関数型インターフェースの場合はreturnを記述
			}

		 */

		Function<String,Integer>func = (String s) -> {return s.length();};
		//								↑引数(String) ↑戻り値(int)

		int num = func.apply("Java");

		//numの中に入っているJavaの文字数を出力
		System.out.println("文字数" + num);

		//引数なしver ※引数がないときは()の中に何も入れない
		Supplier<Date> sup = () -> {return new java.util.Date();};
		System.out.println(sup.get());


		//メソッドaddを格納する関数オブジェクトの作成
		//引数2つ 戻り値:int型
		IntBinaryOperator opr = Main::add;
		int ans = opr.applyAsInt(5, 6);
		System.out.println(ans);


		TriFunction<IntBinaryOperator> tf = (IntBinaryOperator ib , int a, int b) -> {
			int result = ib.applyAsInt(a,b) + ib.applyAsInt(a,b);
			return result;
		};


	}

}
