package Generics;

public class Main {

	public static void main(String[] args) {

		Pocket<String> p = new Pocket();

		//データの入力
		p.put("1111");

		//データの取り出し
		String s = p.get();

		//表示
		System.out.println(s);


	}

}
