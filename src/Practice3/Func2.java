package Practice3;

//基本型以外にジェネリクスを使う
public interface Func2 <E>{

//public 【String】 passCheck(int point, 【String】 name) {
	public E apply(int x, E e);

}
