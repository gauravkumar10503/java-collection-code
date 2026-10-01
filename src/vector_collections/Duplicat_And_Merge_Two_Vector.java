package vector_collections;
import java.util.*;
public class Duplicat_And_Merge_Two_Vector 
{
	public static void main(String []args)
	{
		Vector<Integer> v=new Vector<>(List.of(1,2,3,4,5));
		Vector<Integer> v2=new Vector<>(List.of(2,3,6,7,8));
		
		/*v.addAll(v2);
		System.out.println("Merge vector :- "+v);*/
		
		for(int i=0;i<=v2.size()-1;i++)
		{
			if(v.contains(v2.get(i))==false)
			{
				v.add(v2.get(i));
			}
		}
		System.out.println(v);
	}
}
