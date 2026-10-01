package linkedlist_collection;
import java.util.*;
public class Merge_Two_Linkedlist2 
{
	public static void main(String []args)
	{
		LinkedList<Integer> li1=new LinkedList<>(List.of(1,3,5));
		LinkedList<Integer> li2=new LinkedList<>(List.of(2,4,5));
		LinkedList<Integer> result=new LinkedList<>();
		
		int x=0,y=0;
		while(x<=li1.size()-1 && y<=li2.size()-1)
		{
			if(li1.get(x)<li2.get(y))
			{
				result.add(li1.get(x));
				x++;
			}
			else
			{
				result.add(li2.get(y));
				y++;
			}
		}
		while(x<li1.size())
		{
			result.add(li1.get(x));
			x++;
		}
		while(y<li2.size())
		{
			result.add(li2.get(y));
			y++;
		}
		System.out.println(result);
	}
}
