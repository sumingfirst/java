package socket;

import java.net.Socket;
import java.net.ServerSocket;
import java.io.InputStream;
import java.io.DataInputStream;
import java.io.IOException;
public class Server1 {

	public static void main(String[] args) {
		try{
			ServerSocket ss=new ServerSocket(8888);
			System.out.println("ÕýÔÚ¼àÌý¶Ë¿Ú8888");
			Socket s=ss.accept();
			//open the inputStream
			
			InputStream is=s.getInputStream();
			//read the  number information
			int msg=is.read();
			//print it
			System.out.println(msg);
			//close the InputStream
			
			//read the String information
			DataInputStream dis=new DataInputStream(is);
			//use the ReadUTF to read the
			String msg1=dis.readUTF();
			System.out.println(msg1);
			dis.close();
			is.close();
			s.close();
			ss.close();
			
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
			
		}

	}

}
