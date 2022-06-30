package bank;

public class AxisBank extends BankInfo//BankInfo class is inherited by Axisbank class
{
	
//Over rides method deposit from BankInfo class
	public void deposit()
	{
		System.out.println("I am from Axis Bank");
	}

	public static void main(String[] args) 
	{		
		BankInfo bi=new BankInfo();//object created for BankInfo class
		bi.deposit();//calling the method deposit from BankInfo class
		AxisBank ab=new AxisBank();//object created for AxisBank class
		ab.deposit();//calling the method deposit which is over ridden
	}
}
