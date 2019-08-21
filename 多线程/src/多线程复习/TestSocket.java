package 多线程复习;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;
public class TestSocket {
	public static void main(String[] args) throws IOException {
		InetAddress host= InetAddress.getLocalHost();
		String ip=host.getHostAddress();
		System.out.println(ip);
		Process p=Runtime.getRuntime().exec("ping "+"192.168.43.1");
		BufferedReader br=new BufferedReader(new InputStreamReader(p.getInputStream()));
		StringBuilder sb=new StringBuilder();
		String line=null;
		while((line=br.readLine())!=null)
		{
			if(line.length()!=0)
				sb.append(line+"\r\n");
		}
		System.out.println("本次指令返回的是内容"+sb.toString());
		
	}
	

}
