package FileControl;

import java.io.FileWriter;
import java.io.IOException;

public class Write {

	//このメソッド内でエラーが出たら、呼び出し元にエラーを丸投げする
	public static void main(String[] args) throws IOException{

		//ファイルを開くのは編集権限を持つという解釈
		//開く、閉じるの一連の動作はニュース番組の生中継(違う地点から)を想像すると良い


		FileWriter fw = null;


		try {  //通常行う処理

			//ファイルを開く準備	第二引数はそのまま追記するかどうか
			//trueにすると AABA…と連なっていく falseにすると一文字のみ
			fw = new FileWriter("writeTest.dat",true);
			//書き込み(依頼) 機械がキリの良いタイミングで書き込む、そのため時間が不定

			fw.write(90);

			//書き込み(今すぐ) ↑と異なり今すぐ書き込むように命令できる
			fw.flush();

		}catch(Exception e) { //例外処理 (通常処理中でエラーが出た時にやする処理)

			System.out.println(e.getMessage());

		}finally{ //エラーがあってもなくても最終的に呼び出されるコード


			if(fw != null) { //fwがnullじゃない時

				//try-catch文でさらに例外対策
				try {
					fw.close(); //ファイルを閉じる
				}catch(Exception e) {
					//我々にできることはない(直せるところがない)
				}
			}

		}




	}

}
