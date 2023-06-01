package Practice3;

public class FuncList {
	
	public static boolean isodd(int x) {return (x % 2 == 1);}
	
	public String passCheck(int point, String name) {
		
		//三項演算子 【 条件 ? true処理 : false処理 】
		return name + "さんは" + (point>65?"合格":"不合格");
	}

}
