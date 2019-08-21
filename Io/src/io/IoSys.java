package io;
import java.io.IOException;
import java.io.InputStream;
public class IoSys {

	public static void main(String[] args) {
		try(InputStream s=System.in)
		{
			while(true)
			{
				int i=s.read();
				System.out.println(i
						);
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}
