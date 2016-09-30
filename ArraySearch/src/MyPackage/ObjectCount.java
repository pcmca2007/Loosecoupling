package MyPackage;

public class ObjectCount {

	/**
	 * @param args
	 */
	
	static int count=0;
	
	ObjectCount(){
		
		count++;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ObjectCount oc1=new ObjectCount();
		ObjectCount oc2=new ObjectCount();
		ObjectCount oc3=new ObjectCount();
		ObjectCount oc4=new ObjectCount();
		ObjectCount oc5=new ObjectCount();
		ObjectCount oc6=new ObjectCount();
		
		System.out.println("total Number Of Object Created="+count);

	}

}
