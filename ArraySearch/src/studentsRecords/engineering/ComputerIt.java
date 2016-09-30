package studentsRecords.engineering;

import studentsRecords.StudentBase;

public class ComputerIt extends StudentBase {
	
	
	private String name;
	private String roll;
	private int marks;
	
	public ComputerIt(String name, String roll, int marks){
		
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
