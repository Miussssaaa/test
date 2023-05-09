package Enum;


public class Account {

	private String accountNum; //口座番号 (問題点:違う文字が入る、桁数が違う)
	private int zandaka; //残高
	private accountType accountType; //預金種類(普通、当座、定期) (問題点 : 違う文字が入る → 列挙)


	//コンストラクタ
	public Account(String accountNum, accountType accountType) {
		this.accountNum = accountNum;
		this.accountType = accountType;
	}


	//setter
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public void setZandaka(int zandaka) {

		//残高にマイナス値が入れられた時の対処
		if(zandaka < 0) {
			this.zandaka = 0;
		}else {
			this.zandaka = zandaka;
		}

	}

	public void setAccountType(accountType accountType) {
		this.accountType = accountType;
	}

	//getter
	public String getAccountNum() {
		return this.accountNum;
	}
	public int getZandaka() {
		return this.zandaka;
	}
	public accountType getAccountType() {
		return this.accountType;
	}

	//toStringメソッド フィールド変数を表示
	public String toString() {
		return "口座番号 : " + this.accountNum + "\n残高 : " + this.zandaka + "円\n預金種別 : " + this.accountType;
	}


}
