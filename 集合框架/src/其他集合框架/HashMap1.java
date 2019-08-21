package 其他集合框架;
import java.util.HashMap;
public class HashMap1 {
//HashMap的存储方式是--键值对
	
	public static void main(String[] args) {
		HashMap<String,String>dictionary=new HashMap<>();
		dictionary.put("adc", "魔法英雄");
		dictionary.put("apc", "物理英雄");
		dictionary.put("t", "坦克");
		System.out.println(dictionary.get("t"));
		//对于HashMap而言key是唯一的不可相同，值value可以相同
		//例如key 相同value不同
		System.out.println(dictionary.get("adc"));
		dictionary.put("adc", "下路英雄");
		System.out.println(dictionary.get("adc"));
		System.out.println(dictionary);
		//同一个值可以作为value插入HashMap中只要key不相同就可以
		dictionary.put("hero1", "hello");
		dictionary.put("hero2", "hello");
		System.out.println(dictionary);
		
		

	}

}
