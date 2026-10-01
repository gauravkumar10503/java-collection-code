package linkedlist_collection;
import java.util.*;
public class Reverse_LinkedList 
{
	public static void main(String []args)
	{
		LinkedList<String> l1=new LinkedList<>(List.of("Arun","Varun","Kiran","Udita"));
		//Collections.reverse(l1);
		
		int x=0;
		int y=l1.size()-1;
		while(x<y)
		{
			String left=l1.get(x);
			String right=l1.get(y);
			l1.set(x, right);
			l1.set(y, left);
			x++;
			y--;
		}
		System.out.println(l1);
	}
}
