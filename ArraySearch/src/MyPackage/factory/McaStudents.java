/**
 * 
 */
package MyPackage.factory;

/**
 * @author PRABHASH
 *
 */
public class McaStudents extends AbstractBase {
	
	private String name;
	private String roll;
	private String course;
	
	McaStudents(String name, String roll, String course){
		
		this.name=name;
		this.roll=roll;
		this.course=course;
	}
	
	public String getName(){
		
		return this.name;
	}
	
	public String getRoll(){
		
		return this.roll;
	}
	
	public String getCourse(){
		
		return this.course;
	}
	
}
