package MyPackage;

public class EagerInitializedSingleton {
	
	public static int a=10;
	private static EagerInitializedSingleton instance ;
	
	private EagerInitializedSingleton(){}
	
	
	static{
		
		try{
			instance=new EagerInitializedSingleton();
		}catch(Exception e){
			throw new RuntimeException("Exception occured in creating singleton instance");
		}
	}
	
	
	public static EagerInitializedSingleton getInstance(){
		
		System.out.println("Instance created And returned");
		
		return instance;
	}

}
