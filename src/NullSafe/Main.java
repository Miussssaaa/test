package NullSafe;

 //nullの場合のみ特殊な処理を行うクラス
import java.util.Optional;

public class Main {
	public static void main(String[] args) {

		//nullが入っているかチェックしながら代入を行う(newで生成不可)

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

	}

}
