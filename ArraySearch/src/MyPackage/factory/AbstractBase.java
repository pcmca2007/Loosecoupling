package MyPackage.factory;

public abstract class AbstractBase {
	
	public abstract String getName();
	public abstract String getRoll();
	public abstract String getCourse();
	
	
	public String toString(){
		
		
		return "Namr="+this.getName()+"\n"+"Roll No="+this.getRoll()+"\n"+"Course="+this.getCourse();
	}
	

}
