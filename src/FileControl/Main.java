package FileControl;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException{

		//ファイルを開くのは編集権限を持つという解釈でよい
		//開く、閉じるの一連の動作はニュース番組の生中継(違う地点から)を想像すると良い

		//ファイルを開く準備
		FileWriter fw = new FileWriter("writeTest.dat", true);

		//書き込み(依頼) 機械がキリの良いタイミングで書き込む、そのため時間が不定
		fw.write('A');

		//書き込み(今すぐ) ↑と異なり今すぐ書き込むように命令できる
		fw.flush();

		//ファイルを閉じる
		fw.close();




	}

}
