
import java.util.Scanner;

public class SortSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int lan= scan.nextInt();
		Sort s= new Sort();
		s.sortElement(lan);

	}

}


 class Sort
{
	 String[] elements=null;
	 
	 
	 public void sortElement(int len)
	 {
		elements=new String[len]; 
		 
		 System.out.println("array Length is="+elements.length);
	 }
	 
	
}