package FileControl;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class encrypt {
	public static void main(String[]args) throws IOException{

		String msg = "吾輩は猫である";

		//文字ストリーム読み込み
		Reader r = new StringReader(msg);
		System.out.println((char)r.read());
		System.out.println((char)r.read());
		System.out.println((char)r.read());

		//バイトストリーム読み込み
		ByteArrayOutputStream bs = new ByteArrayOutputStream();
		bs.write(65);
		bs.write(66);

		byte[] array = bs.toByteArray();

		for(byte b : array) {
			System.out.println((char)b);
		}


	}
}
