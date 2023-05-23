package Lambda;

import java.util.Date;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {


	//引数2つ
	//aとbの合計を出力する
	public static int add(int a,int b) {
		return a+b;
	}

	public static void main(String[] args) {

		//ラムダ式 : その場で関数を作る (実行された瞬間から作られる)
		Function<String,Integer>func = (String s) -> {return s.length();};
		//								↑引数(String) ↑戻り値(int)

		int num = func.apply("Java");

		//numの中に入っているJavaの文字数を出力
		System.out.println("文字数" + num);

		//引数なしver ※引数がないときは()の中に何も入れない
		Supplier<Date> sup = () -> {return new java.util.Date();};
		System.out.println(sup.get());


		//メソッドaddを格納する関数オブジェクトの作成


	}

}
