package linkedlist_collection;
import java.util.*;
public class Merge_And_Remove_Common_Elements 
{
	public static void main(String []args)
	{
		LinkedList<Integer> lm=new LinkedList<>(List.of(1,2,4,5,6));
		LinkedList<Integer> lm2=new LinkedList<>(List.of(1,3,7,8,2));
		
		for(int i=0;i<=lm2.size()-1;i++)
		{
			if(lm.contains(lm2.get(i))==false)
			{
				lm.add(lm2.get(i));
			}
		}
		System.out.println(lm);
	}
}
