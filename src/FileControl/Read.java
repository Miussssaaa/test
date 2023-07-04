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
		int i = fr.read();

		//出力
		System.out.println(i);

		//読み込み終了
		fr.close();

	}



}
