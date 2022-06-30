package org.department;//create package org.department

import org.college.College;//College class is created in org.college package, so the package is imported 

public class Department extends College//College Class is inherited by Department Class
{
//method creation for the class Department
	public void deptName()//create method deptName
	{
		System.out.println("Department Name : Admin");
	}
}
