package studentsRecords.engineering;

import studentsRecords.StudentBase;

public class ComputerCse extends StudentBase {
	
	private String name;
	private String roll;
	private int marks;
	
	
	public ComputerCse(String name, String roll, int marks){
		
		this.name=name;
		this.roll=roll;
		this.marks=marks;
		
	}
	
	
	public String getName(){
		
		return this.name;
	}
	
	public String getRoll(){
		
		return this.roll;
	}
	
	public int getMarks(){
		
		return this.marks;
	}
	

}
