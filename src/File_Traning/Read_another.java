package File_Traning;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//問2の正答
public class Read_another {
	public static void main(String[]args) throws IOException{

		//BufferedReaderは一行ずつ読み込める
		BufferedReader br = null;

		//正常に読み込めたか
		boolean flag = true;

		try {

			//読み込むファイルの指定(引数はインスタンス生成したfileReaderで良い)
			br = new BufferedReader(new FileReader("test.txt"));

			br.lines().forEach((String s) -> { System.out.println(s); });

		}catch(Exception e) {

			System.out.println("Error:" + e);
			flag = false;

		}finally{

			//if文はtrueの時に動く 何も無ければflagはtrue
			if(flag) {
				System.out.println("書き込みが完了しました。");
			}


		}


	}

}
