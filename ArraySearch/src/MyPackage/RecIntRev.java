package MyPackage;
import java.util.Scanner;

public class RecIntRev {

	int reverse=0;
	boolean bool=false;
	
	public int recRev(int n){
		
		if(n<0){
			
			n= 0-n;
			bool=true;
			
		}
		
		if(n>0){
			int mod = n % 10;
			reverse = reverse * 10 + mod;
			n=recRev(n/10);
		}
		
		if(bool){
			
			reverse = 0 - reverse;
		}
		
		return reverse;
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecIntRev rc=new RecIntRev();
		
		Scanner s=new Scanner(System.in);
		
		System.err.println("Enter Number:");
		int num=s.nextInt();
		
		int rev=rc.recRev(num);
		
		System.err.println("Reverse Is="+rev);
	}

}
