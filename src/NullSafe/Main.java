package NullSafe;

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

	}

}
