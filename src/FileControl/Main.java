package FileControl;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException{

		//ファイルを開く準備
		FileWriter fw = new FileWriter("writeTest.dat", true);

		//書き込み(依頼)
		fw.write('A');


		//ファイルを開くのは編集権限をもつという解釈




	}

}
