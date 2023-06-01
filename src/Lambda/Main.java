package Lambda;

import java.util.Date;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntToDoubleFunction;
import java.util.function.Supplier;

//わかりやすいサイト
//https://www.yoheim.net/blog.php?q=20160410
//https://www.ne.jp/asahi/hishidama/home/tech/java/functionalinterface.html

public class Main {


	//addメソッド
	//aとbの合計を出力する
	public static int add(int a,int b) {
		return a+b;
	}
	public static int hiku(int a,int b) {
		return a-b;
	}


//＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝


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

			引数1つ　Function<T, R>	(T) -> R	Tを受け取ってR(処理)を返す関数
			引数2つ　BiFunction<T,U,R> (T,U) -> R　　T,Uを受け取ってR(処理)を返す関数
			引数3つ　TriFunction<T,U,V,R>  (T,U,V) -> R  T,U,Vを受け取ってR(処理)を返す関数

		 */



		//①引数の文字数を求めて戻り値を返すメソッドをラムダ式でfuncに代入
		Function<String,Integer>func = (String s) -> {return s.length();};
		//								↑引数(String) ↑戻り値(int)


		//②applyで上の関数を実行、結果を変数numに代入
		int num = func.apply("Java");

		//③numの中に入っているJavaの文字数を出力
		System.out.println("文字数" + num);


//＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝


		//引数なしver ※引数がないときは()の中に何も入れない
		Supplier<Date> sup = () -> {return new java.util.Date();};
		System.out.println(sup.get());


//＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝


		//メソッドaddを格納する関数オブジェクトの作成
		//引数2つ 戻り値:int型

		//「IntBinaryOperator」int型の引数を2つ取り、int型の戻り値を1つ返すメソッドを代入できる
		//変数oprにaddメソッドを代入(addメソッドは引数が2つだから？
		IntBinaryOperator opr = Main::add;

		//applyAsIntはint型でapplyを実行するという意味
		//引数5と6を引数に変数oprの中身にあるaddメソッドを実行、変数ansに代入
		int ans = opr.applyAsInt(5, 6);

		//ansの中に、変数oprの中にあるaddメソッドの実行結果(5+6=11)が入っている
		System.out.println(ans);


		//TriFunctionは引数が3つ以上存在する場合に使う
		//※BiFunctionは引数が2つ
		//インターフェースである 同パッケージ内にTriFunctionのインターフェースを作成
		//tfにラムダ式代入 tfが利用された時、波カッコ内の処理が実行される
		TriFunction<IntBinaryOperator> tf = (IntBinaryOperator ib , int a, int b) -> {


			//【見る順番②】
			//①変数resultに代入
			//②この場合、引数ibに「addメソッドが入ったopr」が代入される
			//③applyAsIntで変数ibの中身のaddが実行される
			//④実質 opr.applyAsInt(add{1+2}) + opr.applyAsInt(add{1+2})
			int result = ib.applyAsInt(a,b) + ib.applyAsInt(a,b);
			return result;

		};


		//【見る順番①】
		//applyで関数を実行する
		//addメソッドを代入したopr、1と2を引数にして実行
		System.out.println(tf.apply(opr,1,2));


//＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝


		//【省略記法】
		//※IntToDoubleFunctionはintを受け取ってdoubleを返す関数

		//省略なしver
		IntToDoubleFunction normal = (int x) -> {return x * x * 3.14;};

		//右辺にラムダ式を記述する場合は引数の型名を省略できる
		IntToDoubleFunction itdf1 = (x) -> {return x * x * 3.14;};

		//引数が一つのみの場合、()を省略可能
		IntToDoubleFunction itdf2 = x -> {return x * x * 3.14;};

		//戻り値を返すだけの場合(一行だけ)、波カッコとreturnを省略可能
		IntToDoubleFunction itdf3 = x ->  x * x * 3.14;
	}

}
