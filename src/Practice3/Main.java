package Practice3;

public class Main {
	public static void main(String[] args) {


	/* コードに含まれる2つのメソッドを関数として変数に格納し、
	 * Mainクラスを作成してください。関数を代入するためのインタフェース名は
	 * Func1とFunc2とし、それ以外のメソッド名や引数名は任意とします。
	 * 基本型以外はジェネリクスを使用するようにしてください。
	 */


	//FuncListをインスタンス生成
	FuncList list = new FuncList();

	//奇数か判別する関数を代入
	Func1 f1 = FuncList::isodd;

	//合格か不合格か判別するメソッドを代入
	Func2<String> f2 = list::passCheck;

	//applyで実行  奇数だったらtrue 偶数だったらfalse
	System.out.println(f1.apply(5));

	//applyで実行  合格基準の点数に達していれば「合格」と出る
	System.out.println(f2.apply(40, "おもち"));



//============================================================



	/* 練習3-1におけるFuncListクラスの2つのメソッドの内容について、
	 * それぞれラムダ式で表現し、インタフェースFunc1とFunc2に代入して利用するよう
	 * 練習3-1で作成したMain クラスを書き換えてください。
	 */


	Func1 f3 = (int x) -> { return (x % 2 == 1); };

	//戻り値を返すだけの場合(一行だけ)、波カッコとreturnを省略可能
	//Func1 f5 = (x) -> x % 2 == 1;

	Func2<String> f4 = (int point, String name) ->
	{return point + "点  " + name + "さんは" + (point>65?"合格":"不合格"); };

	//戻り値を返すだけの場合(一行だけ)、波カッコとreturnを省略可能
	//Func2<String> f6 = (point, name) -> point + "点  " + name + "さんは" + (point>65?"合格":"不合格");

	System.out.println(f3.apply(4));
	System.out.println(f4.apply(85,"カンガルー"));



	}

}
