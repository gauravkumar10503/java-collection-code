package priorityqueue;

import java.util.*;
public class Emp_Priorityqueue 
{
	public static void main(String []args)
	{
		PriorityQueue<Emp> pe=new PriorityQueue<>();
		pe.offer(new Emp("Gaurav",104));
		pe.offer(new Emp("Anku",101));
		pe.offer(new Emp("Tek",103));
		pe.offer(new Emp("Ritu",102));
		
		
		//System.out.println(pe);
		
		while(!pe.isEmpty())
		{
			System.out.println(pe.poll());
		}
	}
}

class Emp implements Comparable<Emp>
{
	String name;
	int id;
	public Emp(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	
	//we're overriding tostring method to get meaningful information
	public String toString()
	{
		return "Name : "+name+",Id : "+id;
	}
	
	//overriding comparato method
	public int compareTo(Emp o)
	{
		return this.id-o.id;
	}
	
	
}