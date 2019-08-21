package 泛型;
import java.util.ArrayList;

//使用泛型的好处在集合框架大多已经说过了，在这里就不赘述了
//泛型支持的类的栈（先进后出）和队列要分开FiFO先进后出
//对于不支持泛型的栈，例如需要设计一个HeroStack，
//对于支持泛型的栈，需要在类的声明上加一个<T>,T是type是约定俗称的习惯
public class Generic {

	public static void main(String[] args) {
		

	}

}
/*import java.util.HashMap;
import java.util.LinkedList;
 
import charactor.Hero;
import property.Item;
   
public class MyStack<T> {
   
    LinkedList<T> values = new LinkedList<T>();
       
    public void push(T t) {
        values.addLast(t);
    }
   
    public T pull() {
        return values.removeLast();
    }
   
    public T peek() {
        return values.getLast();
    }
       
    public static void main(String[] args) {
        //在声明这个Stack的时候，使用泛型<Hero>就表示该Stack只能放Hero
        MyStack<Hero> heroStack = new MyStack<>();
        heroStack.push(new Hero());
        //不能放Item
        heroStack.push(new Item());
         
        //在声明这个Stack的时候，使用泛型<Item>就表示该Stack只能放Item
        MyStack<Item> itemStack = new MyStack<>();
        itemStack.push(new Item());
        //不能放Hero
        itemStack.push(new Hero());
    }
   
}*/