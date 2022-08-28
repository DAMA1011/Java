package pack1; // 會生成一個 package 目錄名稱，如果路徑很多層，用 . 區隔目錄，ex. package xxx.yyy.zzz;
// Class 名稱: pack1.Item，只要是在其他 package 之下的 Class，其名稱已發生變化，真正的名稱前面須包含目錄名稱
public class Item {

	public static void main(String[] args) {

		System.out.println("Item class in a package");
		
	}

}
