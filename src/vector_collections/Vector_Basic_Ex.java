package vector_collections;
import java.util.*;
public class Vector_Basic_Ex 
{
	public static void main(String []args)
	{
		//Vector creation
		Vector<String> v=new Vector<>();
		
		//add method
		v.add("Apple");
		v.add("Banana");
		v.add("Cherry");
		System.out.println(v);
		
		//get method
		v.add(1,"Mango");
		System.out.println(v);
		System.out.println("Index -2 "+v.get(2));
		
		//remove method
		v.remove(2);
		System.out.println(v);
		
		//for each loop
		for(String element :v)
		{
			System.out.println(element);
		}
	}
}
