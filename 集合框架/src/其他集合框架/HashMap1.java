package �������Ͽ��;
import java.util.HashMap;
public class HashMap1 {
//HashMap�Ĵ洢��ʽ��--��ֵ��
	
	public static void main(String[] args) {
		HashMap<String,String>dictionary=new HashMap<>();
		dictionary.put("adc", "ħ��Ӣ��");
		dictionary.put("apc", "����Ӣ��");
		dictionary.put("t", "̹��");
		System.out.println(dictionary.get("t"));
		//����HashMap����key��Ψһ�Ĳ�����ͬ��ֵvalue������ͬ
		//����key ��ͬvalue��ͬ
		System.out.println(dictionary.get("adc"));
		dictionary.put("adc", "��·Ӣ��");
		System.out.println(dictionary.get("adc"));
		System.out.println(dictionary);
		//ͬһ��ֵ������Ϊvalue����HashMap��ֻҪkey����ͬ�Ϳ���
		dictionary.put("hero1", "hello");
		dictionary.put("hero2", "hello");
		System.out.println(dictionary);
		
		

	}

}
