package 数字与字符串系列;

import java.util.Scanner;

public class Format {

	public static void main(String[] args) {
		String name="盖伦";
		int kill=8;
		String title="超神";
		String Sentence=name+"在进行了"+kill+"次击杀"+title;
		System.out.println(Sentence);
		//使用格式化输出%s代表字符串%d代表数字%n代表换行
		String SentenceFormat ="%s在进行了连续%d次击杀后获得了%s的称号%n";
		//使用printf进行格式化输出
		System.out.printf(SentenceFormat,name,kill,title);
		//使用format进行格式化输出
		System.out.format(SentenceFormat,name,kill,title);
		System.out.printf("这是换行符%");
		System.out.printf("这是换行符%n");
		int year=2020;
		System.out.format("%d%n",year);
		//右对齐
		System.out.format("%8d%n",year);
		//左对齐
		System.out.format("%-8d%n",year);
		//加上千位分隔符
		
		System.out.format("%,8d%n",year*1000);
		//前面加上0
		System.out.format("%08d%n",year);
		Scanner s=new Scanner(System.in);
		System.out.println("请输入地名：");
	    String str1 = s.next();
	    System.out.println("请输公司名");
	    String str2 = s.next();
	    System.out.println("请输入人名");
	    String str3 = s.next();
	    System.out.println();
	    String str4= s.next("请输入金额");
	    


	}

}
