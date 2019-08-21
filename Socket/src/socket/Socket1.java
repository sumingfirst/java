package socket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Socket1 {
//acqurie the computer ip address
	public static void main(String[] args)throws  IOException {
		InetAddress ip=InetAddress.getLocalHost();//acquire the computer name and hostAdress and return 
		String ips=ip.toString();//toString the infromation
		String ips2=ip.getHostAddress();//only to acqurie the computer HostAdress
		System.out.println(ips);
		System.out.println("本机的ip地址是"+ips2);
		//with the help of the 'ping' can pick out the avaiable hostadress
		//the ping is the windows-build in tool .Butjava can use a special method to judge if the adress is avaiable
		Process p=Runtime.getRuntime().exec("ping "+"172.16.48.125");
		BufferedReader br=new BufferedReader(new InputStreamReader(p.getInputStream()));
		String line=null;
		StringBuilder sb=new StringBuilder();
		while((line=br.readLine()) != null)
		{
			if(line.length()!=0)
				sb.append(line+"\r\n");
		}
		
		System.out.println("本次指令返回的信息是："+sb.toString());
		//housewoek seek for our computer avaiable Hostadress
		
	}

}

