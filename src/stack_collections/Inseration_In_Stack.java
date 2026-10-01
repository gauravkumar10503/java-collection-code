package stack_collections;
import java.util.*;
public class Inseration_In_Stack 
{
	public static void main(String []args)
	{
		Stack<Integer> is=new Stack<>();
		is.push(2);
		is.push(3);
		is.push(4);
		is.push(5);
		
		int index=2;
		int element=99;
		Stack<Integer> is2=new Stack<>();
		while(is.size()>index)
		{
			is2.push(is.pop());
		}
		is.push(element);
		while(is2.size()>0)
		{
			is.push(is2.pop());
		}
		System.out.println(is);
	}
}
