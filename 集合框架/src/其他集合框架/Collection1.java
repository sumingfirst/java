package �������Ͽ��;
//collection��һ���ӿ�Dequeue��Queue���Ƚ��ȳ�����
//collections��һ���࣬��ͬ�����ArrayList�࣬������Collections��
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Collection1 {

	public static void main(String[] args) {
		// ��תreverse
		List<Integer>numbers=new ArrayList<>();
		for(int i=0;i<10;i++)
		{
			numbers.add(i);
		}
		System.out.println(numbers);
		
		Collections.reverse(numbers);
		System.out.println("��ת�������");
		System.out.println(numbers);
		//shuffle����
		Collections.shuffle(numbers);
		
		
		System.out.println("���Ⱥ������");
		System.out.println(numbers);
		//sort����
		Collections.sort(numbers);
		System.out.println("����������");
		System.out.println(numbers);
		//swap����
		Collections.swap(numbers, 0,9 );
		System.out.println("�����������");
		System.out.println(numbers);
		//sort����
		Collections.sort(numbers);
		System.out.println("����������");
		System.out.println(numbers);
		//rotate����
		Collections.rotate(numbers, 2);
		System.out.println("�����������");
		System.out.println(numbers);
	}

}
