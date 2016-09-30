package studentsRecords;

public class MyCall {

	
	public static void main(String[] args) {
		
		StudentBase base= StudentSingleton.getStudent("CSE", "Irfan", "IC123", 666);
		
		StudentBase base1= StudentSingleton.getStudent("IT","Abhishek", "IC345", 766);
		
		System.out.println("CSE Student record:\n"+base);
		System.out.println();
		System.out.println("IT Student Record:\n"+base1);
		
		System.out.println();
		System.out.println("Average marks:"+(base.getMarks()+base1.getMarks())/2);

	}

}
