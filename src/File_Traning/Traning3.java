package File_Traning;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Traning3 {
	public static void main(String[]args) throws IOException{

		//ファイル読み込みクラス作成
		//一行ずつ読み込みされる
		BufferedReader br = new BufferedReader(new FileReader("inputNum.txt"));

		int sum = 0; //合計値
		String str = ""; //文字列を一行ずつ入れる

		//文字列が空じゃない時繰り返す
		while(str != null){

			//文字列を代入する
			str = br.readLine();

			//文字列がnullだった場合処理を即終了
			if(str == null) {
				break;
			}

			//Integer.parseIntで文字列を数字に変換して足し算
			sum += Integer.parseInt(str);

		}

		System.out.println("合計値は" + sum + "です。");

		//ファイルを開いたら必ず閉じる
		br.close();

	}

}
