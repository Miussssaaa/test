package Practice3;

//「関数リスト」を表すクラス
public class FuncList {


	//奇数か判別するメソッド
	public static boolean isodd(int x) {
		return (x % 2 == 1);
	}


	//点数で合格か不合格か判断
	public String passCheck(int point, String name) {

		//三項演算子 【 条件 ? true処理 : false処理 】
		return point + "点  " + name + "さんは" + (point>65?"合格":"不合格");
	}

}
