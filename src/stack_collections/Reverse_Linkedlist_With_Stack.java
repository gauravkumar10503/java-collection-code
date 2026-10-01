package stack_collections;
import java.util.*;
public class Reverse_Linkedlist_With_Stack 
{
	public static void main(String []args)
	{
		LinkedList<Integer> lr=new LinkedList<>(List.of(10,20,30,40,50));
		Stack<Integer> stack=new Stack<>();
		
		for(Integer i: lr)
		{
			stack.push(i);
		}
		
		lr.clear(); // clearing the linked list
		int size=stack.size(); //Here we're storing the size of the stack in int size
		
		/*for(int i=1;stack.isEmpty()==false;i++) 
		 * we can write the condition in this way in for loop 
		 * it will give us same answer like other
		 */
		
		for(int i=1;i<=size;i++)
		{
			lr.add(stack.pop());
		}
		System.out.println(lr);
	}
}
