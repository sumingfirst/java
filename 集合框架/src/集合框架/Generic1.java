package ���Ͽ��;

import java.util.ArrayList;
import java.util.List;

//��ָ�����͵��������Դ���κ���������
//ָ�����͵���������ֻ�ܴ��ĳЩ�������������
public class Generic1 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		List heros=new ArrayList();
		//���ڲ�ʹ�÷��͵����������������治������Ӣ��Ҳ���Լ�����Ʒ
		heros.add(new Hero("����"));
		heros.add(new Item1("����"));
		//������ת�ͻ�������⣬��������ӵĶ�����࣬��������䲻���ʱ��
		Hero h1=(Hero) heros.get(0);
		Hero h2=(Hero) heros.get(1);
		//�������뷺��֮���䣬��ָ����ĳ������ֻ���Է�ĳ�ֶ��󣬷ű�ľͳ���
		List<Hero>herosGenericl=new ArrayList<Hero>();
		herosGenericl.add(new Hero("����"));
		//������뷺�ͺ���޷�����ӷ�ָ�����͵Ķ�����herosGenericl.add(new Item1("����ʯ"));
		//���ҷ��ͻ����Դ��ָ���������
		//��ȡ������ʱ����Ҫ����ת����1����Ϊ�϶�����Ҫȡ��������
		Hero h3=herosGenericl.get(0);
		//���Ϳ�����΢��дһ�㣬List<Hero>=new ArrayList<>()

	}

}
