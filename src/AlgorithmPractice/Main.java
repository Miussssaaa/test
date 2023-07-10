package AlgorithmPractice;

public class Main {

	public static void main(String[] args) {

		//二次元配列
		int[][] array =  {{1,2,3},{4,5,6}};



		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {

				array[i][j] = array[j][i];

			}
		}

		System.out.println(array);


	}

}

/*
	  縦並びにするとき

	123	  14		1が[0][0]から[0][0]
	456	  25		2が[0][1]から[1][0]
		  36		3が[0][2]から[2][0] …

*/


//努力課題
//・メソッドの形にして、呼び出すたびに90度回転するようにする
//・配列が3×3、4×4でも動くようにする
//・表示するだけでなく、倒した形を格納した変数を作る
