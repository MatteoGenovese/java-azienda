package org.company.italy;

import java.time.LocalDate;

public class Main {
	
	public static void main(String[] args) {
		

		LocalDate date= LocalDate.of(1991,04, 05);
		Employee e1 = new Employee("Matteo", "Genovese", date, 1200, 12);
		System.out.println(e1);
		
		date= LocalDate.of(1997,04, 05);
		Employee e2 = new Employee("Daniele", "Ciccini", date, 1400, 11);
		System.out.println(e2);
		
		date= LocalDate.of(1995,04, 05);
		Employee e3 = new Employee("Luca", "Gatto", date, 2800, 6);
		System.out.println(e3);
		
		date= LocalDate.of(1995,04, 05);
		Boss b1 = new Boss("Rosario", "Rossi", date, 2800, 10000);
		System.out.println(b1);
		
		date= LocalDate.of(1995,04, 05);
		Boss b2 = new Boss("Filippo", "Chiari", date, 2800, 1000);
		System.out.println(b2);
		
		Person[] p = {e1,e2,e3,b1,b2};
		
		int maxAnnualSalary=Integer.MIN_VALUE;
		int minAnnualSalary=Integer.MAX_VALUE;
		
		int companyAnnualCost=0;
		float averageAnnualSalary=0;
		
		Person maxSalaryPerson=null;
		Person minSalaryPerson=null;
		
		int maxAnnualSalaryBoss=Integer.MIN_VALUE;
		int minAnnualSalaryEmployee=Integer.MAX_VALUE;
		
		Person minSalaryEmployee=null;
		Person maxSalaryBoss=null;

		
		for(int i=0;i<p.length;i++)
		{
			if(p[i].getYearIncome()>maxAnnualSalary)
			{
				maxAnnualSalary = p[i].getYearIncome();
				maxSalaryPerson=p[i];
			}
			if(p[i].getYearIncome()<minAnnualSalary)
			{
				minAnnualSalary = p[i].getYearIncome();
				minSalaryPerson=p[i];
			}
			if(p[i].getClass().getName().endsWith("Employee") && p[i].getYearIncome()<minAnnualSalaryEmployee)
			{
				minAnnualSalaryEmployee=p[i].getYearIncome();
				minSalaryEmployee=p[i];
				
			}
			
			if(p[i].getClass().getName().endsWith("Boss") && p[i].getYearIncome()>maxAnnualSalaryBoss)
			{
				maxAnnualSalaryBoss=p[i].getYearIncome();
				maxSalaryBoss=p[i];
			}

			
			companyAnnualCost+=p[i].getYearIncome();
			
			
		}
		averageAnnualSalary=companyAnnualCost/p.length;
		
		System.out.println("---------------------------------");
		System.out.println("---------------------------------");

		System.out.println("\nminSalaryPerson: "+minSalaryPerson);
		System.out.println("\nmaxSalaryPerson: "+maxSalaryPerson);
		System.out.println("\ncompanyAnnualCost: "+companyAnnualCost);
		System.out.println("\naverageSalary: "+averageAnnualSalary);
		System.out.println("---------------------------------");
		System.out.println("---------------------------------");
		System.out.println("\nBossHighestSalary: "+maxSalaryBoss.getFullName());
		System.out.println("\nEmployeelowerSalary: "+minSalaryEmployee.getFullName());

	}

}
