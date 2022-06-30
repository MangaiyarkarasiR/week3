package week3.assignments.day2;

import java.util.ArrayList;

public class PrintDuplicates 
{
public static void main(String[] args) 	
{
	//create new Array list as list 
	ArrayList <Integer> list = new ArrayList<Integer>();
	//add values to the list 
	 list.add(14);
	 list.add(12);
	 list.add(13);
	 list.add(11);
	 list.add(15);
	 list.add(14);
	 list.add(18);
	 list.add(16);
	 list.add(17);
	 list.add(19);
	 list.add(18);
	 list.add(17);
	 list.add(20);
	 //to find the duplicate values loop through the list from first element till second element from last
	 for(int i=0;i<list.size()-1;i++)
		{
		 int count=0;//initialise count as 0 for each iteration of the outer loop
			for(int j=i+1;j<list.size();j++)//within the inner loop iterate from second element of the list to last element of the list 
			{
				if(list.get(i)==list.get(j)) //get the values of the list for both iterating variable and compare if both are equal
				{
					count++;//if both are equal increase the count with +1
				}									
			}	
			if(count>0)//outside the inner loop check if the count greater than 0  
			{
				System.out.println(list.get(i)+" is duplicated");//print the duplicated value 
			}
		}
}
}
