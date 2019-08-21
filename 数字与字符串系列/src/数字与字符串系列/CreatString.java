package 数字与字符串系列;

public class CreatString {

	public static void main(String[] args) {
		int t;
		//两种直接创建字符串的方法
		String  garren="盖伦";
		String teemo=new String("提莫");
		//通过字符数组创建字符串
		char cf[]={'1','3','6'};
		String a=new String(cf);
		//通过+进行字符串的创建
		String b=garren+teemo;
		//String 因为是finall所以不能被继承，并且immutable不能进行任何修改
		//字符串的长度
		System.out.println(b.length());
		//创建随机字符串
		//数字的随机48到57
		//字母的65到122其中90到97为非字母数字
		char s5[]=new char[5];
		for(int i=0;i<5;i++)
		{
			
			do {
				t=48+(int)(Math.random()*75);
				
			}while(t<65&&t>57||t>90&&t<97);
			s5[i]=(char) t;
		}
		
		for(int i=0;i<5;i++)
		{
			System.out.println(s5[i]);
		}
		
				
		}

	}


