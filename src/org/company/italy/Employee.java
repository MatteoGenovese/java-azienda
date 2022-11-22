package org.company.italy;

import java.time.LocalDate;

public class Employee extends Person {
	
	private int salary;
	private int monthlyCount;
	
	

	public Employee(String name, String surname, LocalDate dateOfBirth, int salary, int monthlyCount) {
		super(name, surname, dateOfBirth);
		setSalary(salary);
		setMonthlyCount(monthlyCount);
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getMonthlyCount() {
		return monthlyCount;
	}

	public void setMonthlyCount(int monthlyCount) {
		this.monthlyCount = monthlyCount;
	}

	@Override
	public int getYearIncome() {
		// TODO Auto-generated method stub
		return getSalary()*getMonthlyCount();
	}

	@Override
	public String toString() {
		
		return  "\nEmployee: "+super.toString()+
				"\nYear income: "+getYearIncome();
		
		
		
//		return "Employee [salary=" + salary + ", monthlyCount=" + monthlyCount + ", getSalary()=" + getSalary()
//				+ ", getMonthlyCount()=" + getMonthlyCount() + ", getYearIncome()=" + getYearIncome() + ", getName()="
//				+ getName() + ", getSurname()=" + getSurname() + ", getDateOfBirth()=" + getDateOfBirth()
//				+ ", getCompanyCode()=" + getCompanyCode() + ", toString()=" + super.toString() + ", getFullName()="
//				+ getFullName() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}


	
	
	
	
	

}
