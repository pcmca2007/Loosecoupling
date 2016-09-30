package MyPackage.factory;

public class ClientCall {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractBase btech= FactpryClass.getStudent("Btech", "Anuj Sharma", "5NC10096", "B.Tech");
		
		AbstractBase mca= FactpryClass.getStudent("Mca", "Prabhash Mishra", "5NC10093", "MCA");
		
		System.out.println("Btech Student Reords:\n"+btech);
		
		System.out.println();
		
		System.out.println("MCA Student Records:\n"+ mca);

	}

}
