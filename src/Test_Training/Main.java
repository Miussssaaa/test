package Test_Training;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[]args) throws IOException{


/*
	問題: ファイルの結合
	複数のテキストファイル（file1.txt、file2.txt、file3.txtなど）の内容を順番に読み込み、
	1つの新しいテキストファイル（merged.txt）に結合して書き込みなさい。

	条件：1文字ずつではなく、文字列で読み込むこと

*/

		try {

			//各ファイル読み込み
			//配列に格納
			BufferedReader[] brList = {

				new BufferedReader(new FileReader("file1.txt")),
				new BufferedReader(new FileReader("file2.txt")),
				new BufferedReader(new FileReader("file3.txt"))

			};


			//一つのファイルに複数行を書き込めるように設定
			BufferedWriter bw = new BufferedWriter(new FileWriter("merged.txt"));


			//配列から一行ずつ読み込む
			for(BufferedReader br : brList) {

				bw.write(br.readLine());
				br.close();

			}

			//ファイル閉じる
			bw.close();


		}catch (Exception e) {

			System.out.println("Error:" + e);

		}



	}








}
