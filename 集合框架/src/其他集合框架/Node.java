package 其他集合框架;

import java.util.ArrayList;
import java.util.List;

//二叉树的基本逻辑是小的相同的放在左边，大的放在右边
public class Node{
	//定义左子节点
	public Node LeftNode;
	//定义右子节点
	public Node RightNode;
	//值
	public Object value;
	//插入数据
	public void add(Object v)
	{
		//如果当前的节点没有值，就把数据放在当前的节点上
		if(null==value){
			value=v;
		}
		//如果当前的节点有值，就进行判断，新增值和当前值的大小，
		else {
			//新增的值比当前的值小，或者相同
			if( (Integer)v-(Integer)value<=0)
			{
				if(null==LeftNode)
					LeftNode=new Node();
				LeftNode.add(v);
			}//如果新增的值比当前的值大
			else{
				if(null==RightNode)
				RightNode=new Node();
				RightNode.add(v);
			}
		}
		
		
		
	}
	//上面进行的实际上是对于二叉树的插入，下面我们需要进行的是对于二叉树的遍历
	//二叉树的遍历分为：左序，中序，右序
	//左序实际上是指：中间的数遍历后放在左边 如：67，7，97
	//中序实际上是指，中间的数遍历后放在中间如7，67，94
	//右序是指，中间的数遍历后放在右边如7，94，63
	//如果想要，从左到右来排序，选择中序就可以了
	//中序遍历所有节点
	public List<Object> values(){
		 List<Object> values= new ArrayList<>();
		 //左节点遍历的结果
		 if(null!= LeftNode){
			 values.addAll(LeftNode.values());
		 }
		 //当前的节点
		 values.add(values);
		 //右节点遍历的结果
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
