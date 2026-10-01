package stack_collections;
import java.util.*;
public class Move_Stack_To_Another_Stack 
{
	public static void main(String []args)
	{
		Stack<Integer> s1=new Stack<>();
		s1.push(2);
		s1.push(3);
		s1.push(4);
		s1.push(5);
		
		System.out.println(s1);//printing the stack
		
		Stack<Integer> s2=new Stack<>();
		while(s1.size()>0)
		{
			int p=s1.peek();
			s2.push(p);
			s1.pop();
		}
		Collections.reverse(s2);// reversing the stack (it has to look same like s1
		System.out.println(s2);
	}
}
