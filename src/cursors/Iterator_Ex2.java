package cursors;

import java.awt.List;
import java.util.*;
public class Iterator_Ex2 
{
	public static void main (String []args)
	{
		ArrayList<String> lists=new ArrayList<>();
		lists.add("ABCD");
		lists.add("EF");
		lists.add("GHI");
		lists.add("JKLMN");
		lists.add("OPQRTS");
		
		Iterator<String> itr=lists.iterator();
		while(itr.hasNext())
		{
			String next=itr.next();
			if(next.length()<=3)
			{
				itr.remove();
			}
		}
		System.out.println("Remaining elements :- "+lists);
	}
}
