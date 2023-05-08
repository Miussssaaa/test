package Generics;

public class Main {

	public static void main(String[] args) {

		Pocket p = new Pocket();

		//データの入力
		p.put("1111");

		//データの取り出し
		String s = (String)p.get();

		//表示
		System.out.println(s);


	}

}
