package arraylist_collection;

public class Foreach_Loop 
{
	public static void main(String []args)
	{
		//Integer is a wrapper class
		Integer []a= {10,20,30,40,50};
		String []b= {"East","West","North","South"};
		Boolean []c= {true,false,true};
		printarray(a);
		printarray(b);
		printarray(c);
	}
	public static <T> void printarray(T []a)
	{
		for(T element :a)
		{
			System.out.print(element+" ");
		}
		System.out.println();
	}
}
