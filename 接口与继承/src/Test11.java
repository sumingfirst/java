
public class Test11 extends Test2{

	public int get(int a)
	{
		return a+100;
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

		Test2 t2=new Test2();
		System.out.println(t2.get(10));
		t2=new Test11();
		System.out.println(t2.get(10));
		
	}

}
