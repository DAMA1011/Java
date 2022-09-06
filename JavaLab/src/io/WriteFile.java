package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {

		try (FileOutputStream fos = new FileOutputStream("c:\\java\\2.txt");
				BufferedOutputStream bos = new BufferedOutputStream(fos);) {

			String message = "Java課";
			byte[] bytes = message.getBytes();
			bos.write(bytes);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
