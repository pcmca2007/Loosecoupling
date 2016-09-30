package MyPackage.factory;

public class FactpryClass {

	
	public static AbstractBase getStudent(String Coursetype, String name, String roll, String course){
		
		
		if("Btech".equalsIgnoreCase(Coursetype))
		
				return new BtechStudent(name, roll, course);
		
		else if("MCA".equalsIgnoreCase(Coursetype))
			
				return new McaStudents(name, roll, course);
		
		return null;	
		
	}
	
}
