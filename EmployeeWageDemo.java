package com.bl.Employeewageucq11.Practise;

public class EmployeeWageDemo {
	public static void main(String[] args) {
		EmployeeWageBuilder empWageBuilder = new EmployeeWageBuilder("Raj");
		empWageBuilder.addCompany(new Company("Dmart", 8, 20, 20, 60));
		empWageBuilder.addCompany(new Company("tata", 8, 20, 20, 60));
		empWageBuilder.addCompany(new Company("infosys", 8, 20, 20, 60));
		empWageBuilder.addCompany(new Company("dell", 9, 40, 40, 100));
		empWageBuilder.addCompany(new Company("wipro", 8, 25, 25, 80));
		empWageBuilder.addCompany(new Company("sun mirco", 7, 19, 21, 75));
		
		System.out.println(empWageBuilder.getCompany(2));
		System.out.println(empWageBuilder.getTotalWage("dell"));
		
		System.out.println("\n--------------------\n"+empWageBuilder.getTotalWage("wipro"));


		
	}
	

}
