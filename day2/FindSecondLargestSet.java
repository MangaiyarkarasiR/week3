package week3.assignments.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargestSet {
	public static void main(String[] args) 
	{
		//To find second largest value ,create a new TreeSet as set1
		Set<Integer> set1 = new TreeSet<Integer>();
		//add values to the set
		set1.add(3);	
		set1.add(2);	
		set1.add(11);	
		set1.add(4);
		set1.add(6);
		set1.add(7);
		System.out.println("Sorted Set :"+set1);//print  the set values, as it is Tree set values should be sorted
		List<Integer> list1=new ArrayList<Integer>(set1);//to get the each value of the set , covert it to a list 
		//to get the second largest value in a list ,find the size of the list and get value in the index(size-2) 
		System.out.println("Second Largest Element in a Set :"+list1.get(list1.size()-2));
	}

}
