package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class DownloadImage {

	public static void main(String[] args) throws MalformedURLException{

		URL url = new URL("https://graph.facebook.com/AppStore/picture?type=large");
		
		try (InputStream is = url.openStream(); BufferedInputStream bis = new BufferedInputStream(is);
				FileOutputStream fos = new FileOutputStream("c:\\java\\3.jpg");
				BufferedOutputStream bos = new BufferedOutputStream(fos)){
			
			byte[] buffer = new byte[1024];
			int length;
			while ((length = bis.read(buffer)) != -1) {
				bos.write(buffer, 0, length);
			} // length: 讀到多少資料，就寫多少資料 ; 0: 從位置 0 開始寫
			System.out.println("檔案寫完，請檢查");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
