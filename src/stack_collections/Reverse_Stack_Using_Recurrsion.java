package stack_collections;
import java.util.*;
public class Reverse_Stack_Using_Recurrsion 
{
	public static void main(String []args)
	{
		Stack<Integer>stack=new Stack<Integer>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		reverse(stack);
		System.out.println(stack);
	}
	
	public static void reverse(Stack<Integer> stack)
	{
		//stop condition
		if(!stack.isEmpty())
		{
			int top=stack.pop();
			reverse(stack);
			insertAtBottom(stack,top);
		}
	}
	public static void insertAtBottom(Stack<Integer> stack,int x)
	{
		if(stack.isEmpty())
		{
			stack.push(x);
		}
		else
		{
			int top=stack.pop();
			insertAtBottom(stack,x);
			stack.push(top);
			
		}
	}
}
