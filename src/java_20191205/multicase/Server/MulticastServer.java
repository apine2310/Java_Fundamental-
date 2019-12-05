package java_20191205.multicase.Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class MulticastServer {
	private int port;
	private ArrayList<MulticastServerThread> list;
	
	public MulticastServer(int port){
		this.port = port;
		list = new ArrayList<MulticastServerThread>();
	}
	public void run(){
		ServerSocket serverSocket = null;
		
		MulticastServerThread ust = null;
		try{
			serverSocket = new ServerSocket(port);
			
			while(true){
				System.out.println("클라이언트 접속 대기중...");
				Socket socket = serverSocket.accept();
				System.out.println("클라이언트 IP : " + socket.getInetAddress().getHostAddress());
				
				ust = new MulticastServerThread(socket, list);
				list.add(ust);
				System.out.println("클라이언트 접속 수 : " + list.size());
				
				Thread t = new Thread(ust);
				t.start();
			}
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args){
		new MulticastServer(3000).run();
	}
}
