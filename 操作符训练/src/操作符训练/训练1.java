package 操作符训练;
import java.util.Scanner;
public class 训练1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("请输入您的体重");
		double weight=s.nextDouble();
		System.out.println("请输入您的身高");
		double height=s.nextDouble();
		System.out.println("您的BMI的值为：");
		System.out.println((weight/height/height));

	}

}
