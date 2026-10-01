package cursors;

import java.util.*;
public class Enumeration_Ex2 
{
	public static void main(String []args)
	{
		Stack<String> stack=new Stack<>();
		stack.push("India");
		stack.push("USA");
		stack.push("Germany");
		stack.push("Brazil");
		stack.push("Japan");
		
		Enumeration e=stack.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		System.out.println("Elements according to lifo order ");
		//here we're poping the elements from the stack
		while(!stack.isEmpty())
		{
			System.out.println(stack.pop());
		}
	}
}
