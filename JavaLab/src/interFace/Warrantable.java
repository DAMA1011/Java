package interFace;

public interface Warrantable {

	// 方法不能有實作(抽象方法)，且 public 可以不寫: int 保固天數();
	public int 保固天數();
	
	// 系統常數(static)是允許的，物件屬性是不允許的
	// public static final 是預設值，可以不寫: int MAX_WARRANTY = 365;
	public static final int MAX_WARRANTY = 365;
	
	// Java 8 之後可以寫入實作，但前方須加上 default，子類別繼承後可以 override
	default int 檢測費用() {
		return 500;
	}
	
	// static 表示為靜態方法，綁在介面上，不能再 override
	static int 運費() {
		return 500;
	}
	
}
