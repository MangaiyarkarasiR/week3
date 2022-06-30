package week3.assignments.day2;

import java.util.ArrayList;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingElementInSet {
	public static void main(String[] args) 
{	//create new Tree set as set1
		Set <Integer> set1 = new TreeSet<Integer>();
		//add values to the set
	 	set1.add(1);	
	 	set1.add(2);	
	 	set1.add(3);	
	 	set1.add(4);	
	 	set1.add(7);	
	 	set1.add(6);
	 	set1.add(8);
	 	//as it is Tree set the values should be sorted ,print the set
	 	System.out.println("Sorted Set :  "+set1);
	 	//convert set to list as set can't be accessed with index
	 	List<Integer> list1=new ArrayList<Integer>(set1);	 	
		//loop through the list starting from 1 to last element of the list using size of list
		for(int i=1;i<list1.size();i++)
		{
			if(i!=list1.get(i-1))//compare the if loop variable is not equal to value of the list for each iteration  
			
			{
				System.out.println("Missing Element in a Set : "+i);//print the missing  loop variable
				break;//break the iteration
			}
		}
}
}
