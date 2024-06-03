package com.keyword.st;

public class Emp {

	int eid;
	int salary;
	static String ceo;
	
	static {
		ceo="neha";
	}
	
	public Emp(int eid, int salary) {
		this.eid=eid;
		this.salary=salary;
	}
	
	public void show()
	{
		System.out.println(eid+" : "+salary+" : "+ceo);
		
	}
}

