package interFace;

// 多型: Lawyer(父), Accountant(父) 都是 Superman(子) 的型態
public class Superman implements Lawyer, Accountant {
	
//	ctrl + 1 : 游標點在錯誤，可以快速開啟修復 quick fix
	@Override // 側邊有箭號
	public void 訴訟() {

	}
	
	@Override
	public void 報稅() {
		
	}
	
	public static void main(String[] args) {

		Superman s = new Superman();
		s.訴訟();
		s.報稅();

	}




}
