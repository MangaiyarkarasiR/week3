package week3.assignments.day2;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class FindNumbersOccurance 
{
public static void main(String[] args) 
{
int []arr={2,3,5,6,3,2,1,4,2,1,6,-1};//declare the input as array 
//create a Tree map to get the output in ascending order
	Map<Integer,Integer> map= new TreeMap<Integer,Integer>();		
	for (int i=0;i<arr.length;i++)//iterate through the elements of an array
	{		
		if(map.containsKey(arr[i])==false)////check if the map already contains the element of an array
			map.put(arr[i], 1);// if the element of an array is not present in map , add the element to the map as key and 1 as value
		else
		{
			map.put(arr[i], map.get(arr[i])+1);//if the element of an array is already present in map , update the value of the map by +1 
		
		}
	}	
	Set<Integer> keySet = map.keySet();//get the keySet of the map
	for(Integer eachkey:keySet)//iterate through the each key 
	{
		System.out.println(eachkey+"->" +map.get(eachkey));//print the key,value  which gives the number of Occurrences of each key 
	}
	
	
}
}
