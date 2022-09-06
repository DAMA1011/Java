package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("c:\\java\\io_1.txt");
				BufferedInputStream bis = new BufferedInputStream(fis);) {

			System.out.printf("available = %d%n", bis.available());
			int b = bis.read();
			System.out.println("byte = " + b);
			System.out.println((char) b); // 轉換為文字
			System.out.printf("available = %d%n", bis.available());

			while ((b = bis.read()) != -1) {
				System.out.println((char) b);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
