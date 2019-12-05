package java_20191205.file.server;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class FileServerThread implements Runnable{
	private Socket socket;
	public FileServerThread(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		
		try {
			BufferedReader br = 
					new BufferedReader(
							new InputStreamReader(
									socket.getInputStream()));
			String fileName = br.readLine();
			FileInputStream fis = new FileInputStream("C:\\dev\\io\\2019\\12\\");
			
			byte[] readBytes = new byte[1024*8];
			int readByteCount = 0;
			
			OutputStream out = socket.getOutputStream();
			
			while((readByteCount = fis.read(readBytes)) != -1){
				out.write(readBytes, 0, readByteCount);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
