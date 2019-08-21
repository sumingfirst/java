package 数字与字符串系列;

public class ControlString {

	public static void main(String[] args) {
		String sentence="  我是盖伦,  我要投降，   你呢你接受我投降吗?  ";
		char c=sentence.charAt(1);//获取字符
		System.out.println(c);
//截取字符串
		String s1=sentence.substring(2);
		System.out.println(s1);
		String s2=sentence.substring(2,6);
		System.out.println(s2);
		//分割和for循环的另外一种表达
		String[] s3=sentence.split(",");
		for(String s5:s3)//定义另外一个本类型的数据加上：和原本数组
		{
			
			System.out.println(s5);
		}
		//去掉首尾空格
		String s6=sentence.trim();
		
		System.out.println(s6);	
		//大小写转换
		String s7="ADdewedjADdqw";
		System.out.println(s7.toUpperCase());
		System.out.println(s7.toLowerCase());
		//定位相关的函数
		System.out.println(s6.indexOf("我"));//第一次出现的位置
		System.out.println(s6.lastIndexOf("我"));//最后一次出现的位置
		System.out.println(s6.contains("超神"));//是否包含
		System.out.println(s6.indexOf("我",6));//从6位置开始查询我出现的位置
		//替换相关的函数
		System.out.println(s6.replaceAll("我", "你"));//替换所有
		System.out.println(s6.replaceFirst("我", "你"));//替换一个
	}

}
