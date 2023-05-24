package Lambda;

//引数3つ 戻り値 : それぞれがジェネリクスを使用している
//T→template R→returnの略 大文字の英語に特に指定はない(アルファベット順に記述されていればOK)
public interface TriFunction <T>{


//MainクラスでTriFunctionを使っている Mainクラスはこの形式に従う
//  ↓戻り値の型 ↓引数の型
	int apply(T t, int u, int v);

}
