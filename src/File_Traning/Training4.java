package File_Traning;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Training4 {
	public static void main(String[] args) throws IOException{

		//ファイル読み込みクラス
		BufferedReader br = null;

		String str = "";


		//単語と出現回数を代入する
		Map<String,Integer> wordList = new HashMap<String,Integer>();


		try {

			//文章読み取り変数
			br = new BufferedReader(new FileReader("input.txt"));


			//次の行がなくなるまで繰り返す
			while((str = br.readLine()) != null) {

				//空白区切りで配列に単語を格納する
				String[] words = str.split(" ");

				//全部の単語を参照
				for(String w : words) {

					//全て小文字に統一する
					w = w.toLowerCase();

					//登録済みの単語がある場合
					if(wordList.containsKey(w)) {

						wordList.put(w, wordList.get(w)+1 );

					}else {
						wordList.put(w, 1);
					}

				}


			}

			//System.out.println(wordList);


			//表示用コード作成
			for(Map.Entry<String,Integer>map : wordList.entrySet()) {

				System.out.print(map.getKey() + ":"); //キーを取得
				System.out.println(map.getValue()); //値を取得

			}


		}catch(Exception e) {

			System.out.println("Error:" + e);

		}



	}

}
