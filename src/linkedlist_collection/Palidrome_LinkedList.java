package linkedlist_collection;
import java.util.*;
public class Palidrome_LinkedList 
{
	public static void main(String []args)
	{
		LinkedList<Integer> lk=new LinkedList<>(List.of(10,20,30,20,10));
		boolean found=true;
		int x=0;
		int y=lk.size()-1;
		while(x<y)
		{
			if(lk.get(x)!=lk.get(y))
			{
				found=false;
				break;
			}
			x++;
			y--;
		}
		if(found==true)
		{
			System.out.println("Given linkedlist is palidrome ");
		}
		else
		{
			System.out.println("Given linkedlist is not a palidrome ");
		}
	}
}
