package NullSafe;

 //nullの場合のみ特殊な処理を行うクラス
import java.util.Optional;

public class Main {

/*	 decorateメソッド
	 目的：文字列の両端に文字を追加する（$たなか$）
	 第一引数：文字列（たなか）
	 第二引数：はさむ文字（$）
	 戻り値：Optional<String>　nullが格納される可能性があることを考慮した処理を呼び出し側に強制させる
	 処理：文字列がnull、もしくは文字数が0の場合nullを返す。
	 正しい引数が設定された場合、文字列の両端にはさむ文字を追加する
*/

	public static Optional<String> decorate(String s, char c){

		String str;

		//文字列がnullでないか、0文字じゃないかを判定
		if(s == null || s.length()<=0) {
			str = null; //0だった場合strにnullを格納
		}else {
			str = c + s + c; //文字列の両端に文字を挟みstrに代入
		}
		return Optional.ofNullable(str); //ofNullableを使うことでNullPointerエラーを回避、return
	}





	public static void main(String[] args) {

		//nullが入っているかチェックしながらインスタンス生成を行う(newで生成不可)

		//Nullableはnullの代入を許可する
		Optional<String> op1 = Optional.ofNullable("タナカ");

		//ofのみ書く場合、nullの代入を許さない
		//Optional<String> op2 = Optional.of(null);

		//nullを代入する場合
		Optional<String> op2 = Optional.ofNullable(null);

		//isPresent()は値が存在するかどうか確認するもの
		//nullにしたop2がfalseになる
		System.out.println(op1.isPresent());
		System.out.println(op2.isPresent());

		//格納された内容を表示(中身がnullの場合例外が発生)
		System.out.println(op1.get());
		//System.out.println("名前 : " + op2.get());

		// orElse() は中身がnullだった場合引数を表示する
		System.out.println("名前 : " + op1.orElse("ななし"));
		System.out.println("名前 : " + op2.orElse("ななし"));


		Optional<String> op3 = decorate("たな",'$');
		System.out.println(op3.orElse("nullが格納されています"));


	}

}
