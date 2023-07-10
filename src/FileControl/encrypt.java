package FileControl;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

public class encrypt {
	public static void main(String[]args) throws IOException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException{

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


		//ファイル書き込み用ストリーム
		FileOutputStream fos = new FileOutputStream("data.dat");

		//暗号方式と生成方式などを指定している
		//インスタンスがない場合新しく作る　ある場合番地をコピーする
	    Cipher c = Cipher.getInstance("DES");

	    //鍵生成用クラスのインスタンスを取得
		KeyGenerator KeyGen = KeyGenerator.getInstance("DES");

		//鍵暗号化クラス初期化
		//乱数を使って56ビットに暗号化
		KeyGen.init(56);

		//秘密鍵を出力
		SecretKey key = KeyGen.generateKey();

		//ENCRYPT_MODE　暗号化する
		c.init(Cipher.ENCRYPT_MODE, key);

	    //暗号化
		CipherOutputStream cos  = new CipherOutputStream(fos,c);

		cos.write(65);
	}
}
