package echo.ex01;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		 ServerSocket serverSocket = new ServerSocket();
		 serverSocket.bind(new InetSocketAddress("192.168.0.109",10001)); //IP, 포트번호 세팅, 일단 새로 생성해서 넣는거 외우기
		 
		 
		 System.out.println("<서버시작>");
		 System.out.println("================================================");
		 System.out.println("[연결을 기다리고 있습니다.]");
		 
		 Socket socket = serverSocket.accept(); //new Socket~ 하는게 accept 안에 내장되어있음 소켓이라는 종이컵을 만들어줬다~
		 System.out.println("[클라이언트가 연결되었습니다.");

		 socket.close();
		 serverSocket.close();
	}

}
