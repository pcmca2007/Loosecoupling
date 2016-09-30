package studentsRecords;

public abstract class StudentBase {
	
	
	public abstract String getName();
	public abstract String getRoll();
	public abstract int getMarks();
	
	public String toString(){
		
		return "Name:"+this.getName()+"\n"+"Roll:"+this.getRoll()+"\n"+"Marks:"+this.getMarks();
	}

}
