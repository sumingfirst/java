package socket;

//use the socket to make the program communication
import java.io.IOException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
public class Socket2 {

	public static void main(String[] args) {
		// build connect
		try{
			Socket s=new Socket("127.0.0.1", 8888);
			//open the outputStream
			OutputStream os=s.getOutputStream();
			//transmit 110 to server
			//the follows is transmit the String to server
			//package the DaouputSteam
			DataOutputStream dos=new DataOutputStream(os);
			dos.writeUTF("Legendary");
			//Follows is about Scaner
			Scanner sc=new Scanner(System.in);
			String src=sc.next();
			dos.writeUTF(src);
			dos.close();
			os.write(110);
			os.close();
			s.close();
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}

/*

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) {

		try {
			Socket s = new Socket("172.16.48.125", 8888);

			// 打开输出流
			OutputStream os = s.getOutputStream();

			// 发送数字110到服务端
			os.write(110);
			os.close();

			s.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
*/


