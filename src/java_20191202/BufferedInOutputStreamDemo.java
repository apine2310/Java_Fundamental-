package java_20191202;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInOutputStreamDemo {

	public static void main(String[] args) {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fis = new FileInputStream("c:\\dev\\io\\2019\\12\\pdf.zip");
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream("c:\\dev\\io\\2019\\12\\pdf-copy3.zip");
			bos = new BufferedOutputStream(fos);
			
			/*int readByte = 0;
			long start = System.currentTimeMillis();
			
			while((readByte = bis.read()) != -1){
				bos.write(readByte);
			}
			bos.flush(); // 이거 안하면 크기도 다르고 열리지도 않음 //마지막 작업으로 꼭 해줘야됨
			
			long end = System.currentTimeMillis();
			System.out.printf("경과시간 : %d%n", end-start);
			*/
			int readByteCount = 0;
			byte[] readBytes = new byte[1024*8];
			
			long start = System.currentTimeMillis();
			while((readByteCount = fis.read(readBytes)) != -1){
				fos.write(readBytes, 0, readByteCount);  //진짜 버퍼쓸바에 이거 쓰느게 빠름 ㅎㅎ
			}
			
			long end = System.currentTimeMillis();
			System.out.printf("경과시간 : %d%n", end-start);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try{
				if(fis != null) fis.close();
				if(bis != null) bis.close();
				if(fos != null) fos.close();
				if(bos != null) bos.close();
			} catch(IOException e){
				e.printStackTrace();
			}
		}
	}

}