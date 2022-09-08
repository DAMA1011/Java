package exam07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class IOTest {

	public static void main(String[] args) throws MalformedURLException {

		URL url = new URL("http://iosnetworkdemo.appspot.com/json.jsp?msg=helloWorld");

		try (InputStream is = url.openStream();
				InputStreamReader isr = new InputStreamReader(is, "UTF-8");
				BufferedReader br = new BufferedReader(isr)) {

			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
/*
 * 請利用 Java 程式呼叫此網址，將此網址回傳的結果示在 Console 中(IOTest.java)， 程式中的 Exception 處理除了
 * MalformedURLException 可以直接由方法抛出，其它 的必須使用 try catch 處理，所有 IO 都必須使用 try with
 * resource 來 close。
 */