package com.array;

public class Employee {
	
	private int empId;
	private String name;
	private double sal;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	static boolean isPlaindrome(String name) {
		String rev="";
		int n=name.length();
		for(int i=0;i<n;i++) {
			if(name.charAt(i)==name.charAt(n-1-i)) {
				rev+=name.charAt(i);
			}
		}
		return rev.equals(name);
	}
	 public static String toString(Employee emp){
		 
		return "Employee Details : \nEmpId : "+emp.empId+"\nEmployee name : "+emp.name+"\nSalary : "+emp.sal;
	}
   
	
	public static void main(String[] args) {
	Employee emp1=new Employee();
	emp1.setEmpId(1);
	emp1.setName("aba");
	emp1.setSal(54000);
	emp1.setEmpId(2);
	emp1.setName("aba");
	emp1.setSal(54000);
	Employee emp2=new Employee();
	emp2.setEmpId(4);
	emp2.setName("aba");
	emp2.setSal(54000);
	
	 
	if(isPlaindrome(emp1.name)) {
		//System.out.println("Employee details : \nempid : "+emp1.empId+"\nempName : "+emp1.name+"\nSalary : "+emp1.sal);
	  System.out.println(toString(emp1));
	}
	System.out.println();
	if(emp2.empId%2==0) {
		System.out.println(toString(emp2));
	}
	
	
	}
	
	
	
	

}
