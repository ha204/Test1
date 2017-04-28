import java.util.ArrayList;

public class Persons {
	
//Attributes
public String name;
public String DOB;
public String occupation;
public int salary;
ArrayList<Persons>pets = new ArrayList<Persons>();

//Constructors
public Persons(String name, String DOB, String occupation, int salary, Animal[] pet)
{
	this.name = name;
	this.DOB = DOB;
	this.occupation = occupation;
	this.salary = salary;
	this.pets = pets;
	
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDOB() {
	return DOB;
}

public void setDOB(String dOB) {
	DOB = dOB;
}

public String getOccupation() {
	return occupation;
}

public void setOccupation(String occupation) {
	this.occupation = occupation;
}

public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}

public ArrayList<Persons> getPets() {
	return pets;
}

public void setPets(ArrayList<Persons> pets) {
	this.pets = pets;
}

//Methods




}
