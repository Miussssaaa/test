package Enum;

public class Account {

	private String accountNum; //口座番号
	private int zandaka; //残高
	private String accountType; //口座の種類


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


}
