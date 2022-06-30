package org.student;//create package org.student

import org.department.Department;//Department class is created in org.department package, so the package is imported 

public class Student  extends Department//Department class inherited by  Student 
{
	//methods created for Student class 
	public void studentName()//method studentName
	{
		System.out.println("Student Name: Mangai");
	}
	public void studentDept()//method studentDept
	{
		System.out.println("Student Department : ECE");
	}
	public void studentId()//method studentId
	{
		System.out.println("Student Id : 515621");
	}
	//main method creation
	public static void main(String[] args) 
	{
		Student s= new Student();//object creation for Student class
//Calling all the methods from College class, Department Class and Student Class as College Class is inherited by Department class  and Department Class is inherited by Student class
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
		s.deptName();
		s.studentName();
		s.studentDept();
		s.studentId();
	}

}
