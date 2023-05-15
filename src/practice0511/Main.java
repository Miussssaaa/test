package practice0511;

public class Main {

	public static void main(String[] args) {

		//試行回数
		int openTry = 10;


		//鍵の種類を押しボタンとして定義
		StrongBox<String> box = new StrongBox<String>(KeyType.BUTTON);

		//開いた時のメッセージを代入
		box.put("開いた");


		//設定した数だけ開こうとする
		for(int i = 1; i<=openTry; i++) {

			//nullが返ってきたら「開かない」とメッセージを出す
			//変数ret(putで入れたメッセージ)が入っていたらそのまま出力される
			System.out.println(box.get().orElse("開かない"));

		}



	}

}
