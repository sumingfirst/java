package ���Ͽ��;
import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		//������ArrayList���ڴ�Ŷ���
		ArrayList heros=new ArrayList();
		heros.add(new Hero());
		System.out.println(heros.size());
		//ֻҪ��������������Ӷ����䳤�Ȳ����ڱ�󣬲��õ�������Խ�������
		for(int i=0;i<5;i++)
		{
		heros.add(new Hero("This is a hero"+i));
		System.out.println(heros.size());
		
		}
		//���Ͽ�ܵĳ��÷���
		//�����ǵ�һ��add������ArrayLSIt���������ӵĶ��������ָ��λ�����
		Hero specal=new Hero("special Hero");
		heros.add(3, specal);
		System.out.println(heros.toString());
		System.out.println(heros);
		//�ж�һ�������Ƿ����������棬��׼��������Ƿ���ͬ�������������Ƿ�һ��
		System.out.println("��Ȼһ���¶��������Ҳ��Hero 1��contians���ص�ֵ�ǣ�");
		System.out.println(heros.contains(new Hero("hero1")));//��һ���Ķ�������������
		System.out.println("����specal���ж����ǣ�");
		System.out.println(heros.contains(specal));
		//contians�ж��Ƿ����
		//ͨ��get���ָ��λ�õĶ���
		System.out.println(heros.get(5));
		//ͨ��index Of��ȡ������ڵ�λ��
		System.out.println("specal���ڵ�λ����"+heros.indexOf(specal));
		//ͨ��removeɾ��������ͨ������ɾ����Ҳ���ԡ�ͨ��λ��ɾ��
		System.out.println("��ǰArrayList�ĳ����ǣ�"+heros.size());
		heros.remove(0);
		System.out.println("��ǰArrayList�ĳ����ǣ�"+heros.size());
		heros.remove(specal);
		System.out.println(heros);
		//set�����滻ָ��Ԫ��
		heros.set(3 ,new Hero("����һ��������ӵ�Hero"));
		System.out.println(heros);
		//size��ȡ��С
		//toArrayת��Ϊ����
		
		Hero[] hero=(Hero [])heros.toArray(new Hero[]{});
		//addAll����һ�����������ж��󶼼������
		ArrayList heros1=new ArrayList();
		for(int i=0;i<5;i++)
		{
			heros1.add(new Hero("���ǵڶ������ĵĶ���������"+i));
		}
		heros.addAll(heros1);
		System.out.println(heros);
		//clear���
		heros.clear();;
		System.out.println(heros);
	}

}
