package FileControl;

import java.io.FileReader;
import java.io.IOException;

public class Read {

	public static void main(String[] args) throws IOException{

		//ファイルを開くのは編集権限を持つという解釈
		//開く、閉じるの一連の動作はニュース番組の生中継(違う地点から)を想像すると良い

		//ファイルを読み込む準備
		FileReader fr = new FileReader("writeTest.dat");

		//ファイルを読み込み
		//	int i = fr.read(); //文字コードが出力される(CPUの2進数を変換したもの)
		//	char c = (char)i; //文字コードをchar型にキャスト

		//出力
		//	System.out.println(i);
		//	System.out.println(c);


		int i = 0; //文字コードが代入される
		String str = ""; //文字列(最初は空)


		//文字が何もない時は文字コードが-1になる
		while(i != -1) {
			i = fr.read();  //読み込み
			char c = (char)i;  //文字コードをcharに変換
			str += c;  //文字列を結合
		}

		//全ての文字を出力
		System.out.println(str);

		//読み込み終了
		fr.close();

	}

}
