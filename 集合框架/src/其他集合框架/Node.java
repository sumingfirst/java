package �������Ͽ��;

import java.util.ArrayList;
import java.util.List;

//�������Ļ����߼���С����ͬ�ķ�����ߣ���ķ����ұ�
public class Node{
	//�������ӽڵ�
	public Node LeftNode;
	//�������ӽڵ�
	public Node RightNode;
	//ֵ
	public Object value;
	//��������
	public void add(Object v)
	{
		//�����ǰ�Ľڵ�û��ֵ���Ͱ����ݷ��ڵ�ǰ�Ľڵ���
		if(null==value){
			value=v;
		}
		//�����ǰ�Ľڵ���ֵ���ͽ����жϣ�����ֵ�͵�ǰֵ�Ĵ�С��
		else {
			//������ֵ�ȵ�ǰ��ֵС��������ͬ
			if( (Integer)v-(Integer)value<=0)
			{
				if(null==LeftNode)
					LeftNode=new Node();
				LeftNode.add(v);
			}//���������ֵ�ȵ�ǰ��ֵ��
			else{
				if(null==RightNode)
				RightNode=new Node();
				RightNode.add(v);
			}
		}
		
		
		
	}
	//������е�ʵ�����Ƕ��ڶ������Ĳ��룬����������Ҫ���е��Ƕ��ڶ������ı���
	//�������ı�����Ϊ��������������
	//����ʵ������ָ���м���������������� �磺67��7��97
	//����ʵ������ָ���м��������������м���7��67��94
	//������ָ���м��������������ұ���7��94��63
	//�����Ҫ��������������ѡ������Ϳ�����
	//����������нڵ�
	public List<Object> values(){
		 List<Object> values= new ArrayList<>();
		 //��ڵ�����Ľ��
		 if(null!= LeftNode){
			 values.addAll(LeftNode.values());
		 }
		 //��ǰ�Ľڵ�
		 values.add(values);
		 //�ҽڵ�����Ľ��
		 if(null!=RightNode)
		 {
			 values.addAll(RightNode.values());
		 }
		 return values;
	}
	

	public static void main(String[] args) {
		int randoms[]={12,34,45,50,65,54,56,54,54,23,35,12,4,21,43,12};
		Node roots=new Node();
		for(int numbers:randoms)
		{
			roots.add(numbers);
		}
		
		System.out.println(roots.value);
	}

}
