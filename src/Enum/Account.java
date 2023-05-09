package Enum;


public class Account {

	private String accountNum; //口座番号
	private int zandaka; //残高
	private String accountType; //預金種類(普通、当座、定期)


	//コンストラクタ
	public Account(String accountNum, String accountType) {
		this.accountNum = accountNum;
		this.accountType = accountType;
	}


	//setter
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public void setZandaka(int zandaka) {
		this.zandaka = zandaka;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	//getter
	public String getAccountNum() {
		return this.accountNum;
	}
	public int getZandaka() {
		return this.zandaka;
	}
	public String getAccountType() {
		return this.accountType;
	}

	//toStringメソッド フィールド変数を表示
	public String toString() {
		return "口座番号 : " + this.accountNum + "\n残高 : " + this.zandaka + "円\n預金種別 : " + this.accountType;
	}


}
