package stack_collections;
import java.util.*;
public class Min_Stack 
{
	public static void main(String []args)
	{
		Minstack ob=new Minstack();
		ob.push(30);
		ob.push(20);
		ob.push(10);
		ob.push(5);
		System.out.println(ob.getmin());
	}
}

class Minstack
{
	public Stack<Integer> stack;
	public Stack<Integer> minstack;
	
	public Minstack()
	{
		stack=new Stack<Integer>();
		minstack=new Stack<Integer>();
	}
	public void push(Integer object)
	{
		stack.push(object);
		if(minstack.isEmpty() || object<=minstack.peek())
		{
			minstack.push(object);
		}
	}
	public Integer pop()
	{
		Integer top=stack.pop();
		if(minstack.peek()==top)
		{
			minstack.pop();
		}
		return top;
	}
	
	public Integer getmin()
	{
		return minstack.peek();
	}
}
