package �������Ͽ��;
import java.util.LinkedList;
import ���Ͽ��.Hero;
public class LinkedLsit {

	public static void main(String[] args) {
		// ���з�Ϊ�Ƚ��ȳ�FiFO���Ƚ����FILO��FIFo��java����Ϊ���У�FILO��Ϊջ
		//LinkedList��һ��˫������List
		LinkedList<Hero>heros=new LinkedList<Hero>();
		heros.addFirst(new Hero("���ǵ�һһ������ͷ���Ķ���"));
		heros.addFirst(new Hero("���ǵڶ�������ͷ���Ķ���"));
		heros.addFirst(new Hero("���ǵ���������ͷ���Ķ���"));
		heros.addLast(new Hero("�������һ���������Ӣ��"));
		System.out.println(heros);
		//�鿴��ǰ���Ӣ��
		System.out.println(heros.getFirst());
		//�鿴������Ӣ��
		System.out.println(heros.getLast());
		//ȡ����ǰ���Ӣ��
		heros.removeFirst();
		//ȡ��������Ӣ��
		heros.removeLast();
		System.out.println(heros);
		

	}

}
