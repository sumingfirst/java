package 数字与字符串系列;

public class String2buffer {

	public static void main(String[] args) {
		// 追加(append)删除(delete)，插入（insert），反转（reverse）
		StringBuffer s1=new StringBuffer("我是神");
		s1.append("hello");
		System.out.println(s1);
		s1.delete(0, 1);
		System.out.println(s1);
		s1.insert(0, "god");
		System.out.println(s1);
		s1.reverse();
		System.out.println(s1);
		System.out.println(s1.length());//长度
		System.out.println(s1.capacity());//总空间

	}

}
