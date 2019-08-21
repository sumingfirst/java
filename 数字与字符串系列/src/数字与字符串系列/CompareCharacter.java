package 数字与字符串系列;

public class CompareCharacter {

	public static void main(String[] args) {
		//==是否为同一个字符串的对象
		String s1=new String();
		String s2=s1;
		System.out.println(s1==s2);
		//特殊情况
		String s3=new String("我爱你");
		String s4="我爱你";
		String s5="我爱你";
		
		System.out.println(s5==s4);
		System.out.println(s3==s4);
		//内容是否相同
		System.out.println(s3.equals(s4));
		//以什么开始和结束
		String start="我";
		String end="你";
		System.out.println(s3.startsWith(start));
		System.out.println(s3.endsWith(end));
		

	}

}
