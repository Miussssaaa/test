package FileControl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferingFilter {

	public static void main(String[] args) throws IOException{

		//ファイル読み込み
		FileReader fr = new FileReader("read.dat");

		//バッファリングフィルタ
		//RAMにデータを貯めておき、一度に書き込むことで、書き込み回数を減らす
		//ハードディスク内部の "回転する" ディスク上のデータを読み書きしなければいけないため
		//少量で何度も書き込み要求をするより、一度で終わらせる方が効率がいい
		BufferedReader br = new BufferedReader(fr);


/*		//一行目を読み込み
		String line = br.readLine();

		//行の内容が空じゃない時に繰り返す
		while(line != null) {
			System.out.println(line); //表示
			line = br.readLine(); //次の行(無ければnullが入る)
		}
*/

		//読み込んだファイルの要素分だけ繰り返す(forEach文)
		br.lines().forEach( (String s) -> {System.out.println(s);} );


	}

}
