package Generics;

public class Main {

	public static void main(String[] args) {

		//向こうのクラスに移動して、EでStringが当てはめられる事になる
		Pocket<String> p = new Pocket();

		//データの入力
		p.put("1111");

		//データの取り出し
		String s = p.get();

		//表示
		System.out.println(s);


	}

}
