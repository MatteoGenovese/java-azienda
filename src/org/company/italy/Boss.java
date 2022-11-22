package org.company.italy;

import java.time.LocalDate;

public class Boss extends Person{

	

	private int salary;
	private int bonus;
	
	public Boss(String name, String surname, LocalDate dateOfBirth, int salary, int bonus) {
		super( name,  surname,  dateOfBirth);
		this.salary = salary;
		this.bonus = bonus;
	}
	
	

	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	public int getBonus() {
		return bonus;
	}



	public void setBonus(int bonus) {
		this.bonus = bonus;
	}



	@Override
	public int getYearIncome() {
		// TODO Auto-generated method stub
		return getSalary()*12+getBonus();
	}
	
	@Override
	public String toString() {
		return  "\nBoss: "+super.toString()+
				"\nYear income: "+getYearIncome();
	}
	
	
	
}
