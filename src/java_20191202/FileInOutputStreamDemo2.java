package java_20191202;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInOutputStreamDemo2 {

	public static void main(String[] args) {
		FileInputStream fis = null;  //FileInputStream fis = null;
		FileOutputStream fos = null; //FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("c:\\dev\\io\\2019\\12\\jdk.exe");
			fos = new FileOutputStream("c:\\dev\\io\\2019\\12\\jdk-4.exe");
			/*
			int readByte = 0;
			while((readByte = fis.read()) != -1){
				fos.write(readByte);
			}
			*/
			
			byte readBytes[] = new byte[1024*10];
			int readBytesCount = 0;
			while((readBytesCount = fis.read(readBytes)) != -1){
				fos.write(readBytes, 0, readBytesCount);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
