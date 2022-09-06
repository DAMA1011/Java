package exception;

import java.io.File;
import java.io.FileNotFoundException;

public class TestCheckedException2 {

	public static void main(String[] args) {

		try {
			checkFile("c:\\java\\HelloABC.java");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Finish");
	}

	// 如果下面方法有說要處理錯誤(throws Checked Exception)，上方就需要加 try catch 或 throws
	public static void checkFile(String filePath) throws FileNotFoundException {
		File file = new File(filePath);
		if (!file.exists()) { // 檔案不存在，exist() 為 False，加上 !，讓它變為 True，進入 if 條件做後續
			// FileNotFoundException fne = new FileNotFoundException("檔案不存在");
			throw new FileNotFoundException(filePath + " 檔案不存在");
		}
	}

}
