package org.company.italy;

import java.time.LocalDate;
import java.util.Random;

public abstract class Person {
	
	private String name;
	private String surname;
	private LocalDate dateOfBirth;
	private String companyCode;
	
	
	
	
	public Person(String name, String surname, LocalDate dateOfBirth) {
		
		super();
		
		setName(name);
		setSurname(surname);
		setDateOfBirth(dateOfBirth);
		Random rnd= new Random();
		String companyCode=String.valueOf(rnd.nextInt(100000-10000)+10000);
		setCompanyCode(companyCode);

	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nFull Name: "+getFullName()+
				"\nDate of birth:"+getDateOfBirth();
	}
	
	public String getFullName() {
		return getName()+" "+getSurname()+" ("+getCompanyCode()+").";
	};
	
	public abstract int getYearIncome();
	
	

}
