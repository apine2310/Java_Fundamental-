package java_20191210;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInOutput {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		
		try {
			fis = new FileInputStream("");
			fos = new FileOutputStream("");
			
			int readByte = 0;
			while((readByte = fis.read()) != -1){
				fos.write(readByte);
			}
			
			
			byte readBytes[] = new byte[1024*10];
			int readByteCount = 0;
			while((readByteCount = fis.read(readBytes)) != -1){
				fos.write(readBytes,0,readByteCount);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
