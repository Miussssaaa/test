package TypeSafe;

public class Main {
	//第一引数の文字列を第二引数の数字分だけ出力する
	//第一引数 : 表示したい文字
	//第二引数 : 表示したい回数

	public static void prints(String a, int b) {

		for(int i = 0; i<b; i++) {
			System.out.println(a);
		}

	}

	public static void main(String[] args) {

		prints("犬",5);

	}

}
