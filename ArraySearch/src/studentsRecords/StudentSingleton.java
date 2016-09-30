package studentsRecords;

import studentsRecords.engineering.ComputerCse;
import studentsRecords.engineering.ComputerIt;

public class StudentSingleton {
	
	public static StudentBase getStudent(String branch, String name, String roll, int marks){
		
		if("CSE".equalsIgnoreCase(branch))
			
			return new ComputerCse(name,roll,marks); 
		
		if("IT".equalsIgnoreCase(branch))
			
			return new ComputerIt(name, roll, marks);
		
		return null;
		
	}

}
