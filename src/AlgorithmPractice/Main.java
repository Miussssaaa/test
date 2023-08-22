package AlgorithmPractice;

public class Main {

	public static void main(String[] args) {


	/*
		問題 : 二次元配列を90度回転させる

		  縦並びにするとき

	 	  	  14		1が[0][0]から[0][0]
		123	  25		2が[0][1]から[1][0]
		456	  36		3が[0][2]から[2][0] …


		  さらに反転するとき

	 	14    41		1が[0][0]から[0][1]
		25	　52		2が[0][1]から[1][1]
		36	  63		3が[0][2]から[2][0] …

	*/


	//努力課題
	//・メソッドの形にして、呼び出すたびに90度回転するようにする
	//・配列が3×3、4×4でも動くようにする
	//・表示するだけでなく、倒した形を格納した変数を作る



		//変更前 二次元配列
		int[][] array =  {{1,2,3},{4,5,6}};
		int[][] array2 = rotate(array);

		//配列を出力 変更前
		show(array);

		System.out.println("");

		//90度回転  一回目
		show(array2);

		System.out.println("");


/*
		//縦にする(メソッド書かなかった時)
		for(int i = 0; i<array.length; i++) {
			for(int j = 0; j<array[0].length; j++) {
				array2[j][i] = array[i][j];
			}
		}
*/

		//array2に90度回転させた結果を代入
		array2 = rotate(array2);

		show(array2);

		System.out.println("");


		//同じ処理
		array2 = rotate(array2);

		show(array2);

		System.out.println("");



	}



	//配列を出力するメソッド
	public static void show(int[][] a) {

		//拡張for文 引数で得た配列の要素分 設定
		for(int[]b : a) {

			//拡張for文 ↑の中身を全て参照
			for(int c : b) {
				System.out.print(c);
			}

			System.out.println("");

		}

	}


	//90度回転させるメソッド
	public static int[][] rotate(int[][]array){

		int[][]arrayB = new int[array[0].length][array.length];


		for(int i = 0; i<array.length; i++) {
			for(int j = 0; j<array[0].length; j++) {

				//配列の最大値-iをすると値が逆転する
				arrayB[j][array.length-1-i] = array[i][j];

			}
		}

		return arrayB;


	}



}

