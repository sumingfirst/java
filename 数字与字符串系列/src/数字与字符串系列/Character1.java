package 数字与字符串系列;

import java.util.Scanner;

public class Character1 {

	public static void main(String[] args) {
	char a='a';
	char b='b';
	char c='c';
	Character c1=c;//自动装箱
	c=c1;//自动卸箱
	System.out.println(Character.isLetter('a'));//判断是否是字母
	System.out.println(Character.isDigit('a'));//判断是否是数字
	System.out.println(Character.isWhitespace('a'));//判断是否是空白
	System.out.println(Character.isUpperCase('a'));//判断是否是大写
	System.out.println(Character.isLowerCase('a'));//判断是否是小写
	System.out.println(Character.toUpperCase('a'));//转换成大写
	System.out.println(Character.toLowerCase('a'));//转换成小写
	//String f='a';不可以直接的将字符赋给字符串变量
	String f= Character.toString('a');
	//转义字符
	System.out.println("使用空格并不能出现空格");
	System.out.println("ab   df");
	System.out.println("a def");
	System.out.println("使用水平制表符//t可以达到空格的效果");
	System.out.println("abc\tdef");
	System.out.println("12345678abc");
	System.out.println("a\tbcdef");
	System.out.println("abcde\tf");
	System.out.println("abc\'def");//单引号
	System.out.println("abc\"def");//双引号
	System.out.println("abc\\def");
	//训练读取从键盘输入的信息并将其中的数字和大写数字输出
	Scanner s1=new Scanner(System.in);
	String s2=s1.nextLine();
	char str[]=s2.toCharArray();
	for(int i=0;i<str.length;i++)
	{
		if(Character.isUpperCase(str[i])||Character.isDigit(str[i]))
		{
			System.out.println(str[i]);
		}
	}
	
	}

}
