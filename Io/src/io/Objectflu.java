package io;
//对象流，可以把对象以流的形式传递给其他的介质如磁盘
import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import io.Hero;
public class Objectflu {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Hero h=new Hero();
		h.name="盖伦";
		h.hp=666;
		File f=new File("D:/hello.txt");
		try (FileOutputStream F3=new FileOutputStream(f);
				ObjectOutputStream F4=new ObjectOutputStream(F3);
				FileInputStream F1=new FileInputStream(f);
				ObjectInputStream F2=new ObjectInputStream(F1);
				){
			
			F4.writeObject(h);
			Hero h2=(Hero) F2.readObject();
			System.out.println(h2.name);
			System.out.println(h2.hp);
			
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		}

	}

}
