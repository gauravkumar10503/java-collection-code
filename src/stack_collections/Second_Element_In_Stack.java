package stack_collections;
import java.util.*;
public class Second_Element_In_Stack 
{
	public static void main(String []args)
	{
		Stack<Integer> vr = new Stack<>();
		vr.add(1);
		vr.add(2);
		vr.add(3);
		vr.add(4);
		vr.add(5);
		
		while(vr.size()>1)
		{
			vr.pop();
		}
		System.out.println(vr.peek());
		
	}
}
