package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.FileAlreadyExistsException;

public class TestCheckException {

	public static void main(String[] args) {

		try {
			FileReader fr = new FileReader("c:\\java\\aaa.txt");
			// FileNotFoundException 是 checked exception
			// 這種錯誤不管會不會發生，一定要寫 try catch
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
