package linkedlist_collection;
import java.util.*;
public class Partition_Of_List
{
	public static void main(String []args)
	{
		LinkedList<Integer> pl=new LinkedList<>(List.of(3,5,8,5,10,2,1));
		
		int x=5;
		LinkedList<Integer> before=new LinkedList<>();
		LinkedList<Integer> after=new LinkedList<>();
		
		for(int i=0;i<=pl.size()-1;i++)
		{
			if(pl.get(i)<x)
			{
				before.add(pl.get(i));
			}
			else
			{
				after.add(pl.get(i));
			}
		}
		pl.clear();
		pl.addAll(before);
		pl.addAll(after);
		System.out.println(pl);
	}
}
