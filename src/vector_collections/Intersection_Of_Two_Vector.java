package vector_collections;
import java.util.*;
public class Intersection_Of_Two_Vector 
{
	public static void main(String []args)
	{
		Vector<Integer> tvi=new Vector<>(List.of(1,2,3,4,5));
		Vector<Integer> tvi2=new Vector<>(List.of(5,6,7,8,9));
		Vector<Integer> intersector=new Vector<>();
		
		for(int i=0;i<=tvi.size()-1;i++)
		{
			if(tvi2.contains(tvi.get(i)))
			{
				intersector.add(tvi.get(i));
			}
		}
		System.out.println("Intersector elements :- "+intersector);
		
		
	}
}
