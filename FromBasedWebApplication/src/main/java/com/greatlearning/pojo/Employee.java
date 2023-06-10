package com.greatlearning.pojo;

public class Employee {
	
	public String firstName;
	
	public String lastName;
	
	public String departmnet;
	
	private String[] technologies;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDepartmnet() {
		return departmnet;
	}

	public void setDepartmnet(String departmnet) {
		this.departmnet = departmnet;
	}

	public String[] getTechnologies() {
		return technologies;
	}

	public void setTechnologies(String[] technologies) {
		this.technologies = technologies;
	}
	
	
}
