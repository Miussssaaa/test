package File_Traning;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Write {

	public static void main(String[] args) throws IOException {

		//スキャナー
		Scanner sc = new Scanner(System.in);

		//文字列を代入
		System.out.println("メモに書き込む文字を入れてください : ");
		String txt = sc.nextLine();

		//ファイル書き込み
		BufferedWriter bw = null;

		boolean flag = true;


		//スキャナーで設定した文章を書き込む
		try {

			bw = new BufferedWriter(new FileWriter("test.txt"));
			bw.write(txt);


		//tryでエラーが出た時
		}catch(Exception e) {

			System.out.println("error : " + e); //エラーが出たことを表示
			flag = false; //失敗したのでfalseに切り替える

		}finally{

			//書き終わったら閉じるの忘れない
			bw.close();


			//if文はtrueの時に動く 何も無ければflagはtrue
			if(flag) {
				System.out.println("書き込みが完了しました。");
			}

		}


	}

}
