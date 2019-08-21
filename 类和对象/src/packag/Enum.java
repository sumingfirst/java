package packag;

public class Enum {

	public static void main(String[] args) {
		Sean seaon =Sean.SPRING;
		switch(seaon){
			case SPRING:
				System.out.println("这是春季");
				break;
			case SUMMER:
				System.out.println("这是夏季");
				break;
			case AUTUM:
				System.out.println("这是秋季");
				break;
			case WINTER:
				System.out.println("这是冬季");
				break;
		}//遍历整个枚举类型
		for(Sean s:Sean.values())
		{
			System.out.println(s);
		}

	}

}
