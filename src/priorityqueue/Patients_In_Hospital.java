package priorityqueue;

import java.util.*;
public class Patients_In_Hospital 
{
	public static void main(String []args)
	{
		PriorityQueue<Patient> hp=new PriorityQueue<>();
		hp.offer(new Patient("Anku",1));
		hp.offer(new Patient("Gaurav",3));
		hp.offer(new Patient("Ritu",4));
		hp.offer(new Patient("Tek",2));
		
		while(!hp.isEmpty())
		{
			System.out.println("Severity :- "+hp.poll());
		}
	}
}

class Patient implements Comparable<Patient>
{
	String name;
	int severity; //lower no means more server 
	public Patient(String n,int s)
	{
		name=n;
		severity=s;
	}
	
	//overriding
	public String toString()
	{
		return name+" ("+severity+")";
	}
	
	//overriding
	public int compareTo(Patient o)
	{
		return this.severity-o.severity;
	}
	
}
	