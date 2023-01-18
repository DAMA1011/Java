package io.reader;

import java.io.*;
import java.nio.charset.Charset;

public class ReadByFileReader {
    public static void main(String[] args) throws IOException {

        System.out.println("JVM Encoding＝"+Charset.defaultCharset());

        File file = new File("C:\\java\\char_UTF8.txt");
        try(FileInputStream fis = new FileInputStream(file);
        		InputStreamReader isr = new InputStreamReader(fis, "UTF8");
        		BufferedReader br = new BufferedReader(isr);
        		// FileReader fr = new FileReader(file)
        		){
            
            //改成InputSteamReader
            /*  FileInputStream fis = new FileInputStream(file);
                InputStreamReader isr = new InputStreamReader(fis, "MS950");
                BufferedReader br = new BufferedReader(isr)
                */
//                int c;
//                while ((c = isr.read()) != -1) {
//                    System.out.println((char) c);
//                }
            //}
                String line;
                while((line = br.readLine()) != null) {
                	System.out.println(line);
                }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
