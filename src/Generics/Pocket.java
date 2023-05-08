package Generics;

public class Pocket {

	//データ格納用変数
	private Object data;

	public void put(Object d) {
		this.data = d;
	}

	public Object get() {
		return this.data;
	}
}
