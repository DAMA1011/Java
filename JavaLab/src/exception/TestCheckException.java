package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.util.zip.ZipException;

public class TestCheckException {

	public static void main(String[] args) throws IOException {

		{ // 方法一: try catch
			try {
				FileReader fr = new FileReader("c:\\java\\aaa.txt");
				// FileNotFoundException 是 checked exception
				// 這種錯誤不管會不會發生，一定要寫 try catch
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}

		{ // 方法二: 在上方加 throws
			FileReader fr = new FileReader("c:\\java\\aaa.txt");
		}

	}

}
