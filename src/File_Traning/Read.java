package File_Traning;

import java.io.FileReader;
import java.io.IOException;

//正答は
public class Read {
	public static void main(String[] args) throws IOException{

		//ファイル読み込み
		FileReader fr = new FileReader("test.txt");

		int num = 0; //文字コードが入る
		char chr; //文字コードを文字に変換する
		String str = ""; //読み込んだ文字を結合して代入する


		//文字コードが-1(文字が存在しない時出る)になるまで繰り返す
		while(num != -1) {

			num = fr.read(); //一文字ずつ読み込む
			chr = (char)num; //文字コードを変換
			str += chr; //文字列に結合

		}

		//読み込んだ文字列を出力
		System.out.println(str);

		//処理が終わったら閉じるのを忘れない
		fr.close();

		//読み込んだ文字列が空じゃない時、正常に読み込めたことを示すメッセージを出力
		if(str != null) {
			System.out.println("読み込み完了しました。");
		}


	}

}
