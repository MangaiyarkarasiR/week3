package week3.assignments.day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FindIntersectionSet {
	public static void main(String[] args) {
		//to find intersection using set.create LinkedHashSet as it maintains insertion Order
		Set<Integer> set1 = new LinkedHashSet<Integer>();
		//add values to Set1
		set1.add(3);	
		set1.add(2);	
		set1.add(11);	
		set1.add(4);	
		set1.add(6);	
		set1.add(7);
		//create another LinkedHashSet as Set2
		Set<Integer> set2 = new LinkedHashSet<Integer>();
		//add values to set2
		set2.add(1);	
		set2.add(2);	
		set2.add(8);	
		set2.add(4);	
		set2.add(9);	
		set2.add(7);
		//convert set to list as set can't be accessed through index
		List<Integer> list1=new ArrayList<Integer>(set1);
		List<Integer> list2=new ArrayList<Integer>(set2);
		for(int i=0;i<list1.size();i++)//loop through the list1  
		{
			for(int j=0;j<list2.size();j++)//within the loop iterate through another list
			{
				if(list1.get(i)==list2.get(j))//compare both the values from list1 and list2 are equal
				{
					System.out.println(list1.get(i));//print the common value from any of the list
				}
			}
		}
}
}
