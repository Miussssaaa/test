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

		String line = null;

		line = br.readLine();
		System.out.println(line);


	}

}
