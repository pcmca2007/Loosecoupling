package MyPackage;

import java.util.Scanner;

public class TodayTask {
	
	 public void revNumber(int x){
			
			boolean flag = false;
			
			if (x < 0) {
				x = 0 - x;
				flag = true;
			}
		 
			int reverse = 0;
			int p = x;
			
			
			while (p > 0) {
				int mod = p % 10;
				p = p / 10;
				reverse = reverse * 10 + mod;
			}
		 
			if (flag) {
				reverse = 0 - reverse;
			}
			
				System.out.println("Reverse is"+reverse );
			
			
			
		}
	 
	 
	 public void bubbleSort(int[] elements,int lan){
			
			 int temp;
								
			for (int i = 0; i < lan; i++) 
	        {
	            for (int j = i + 1; j < lan; j++) 
	            {
	                if (elements[i] > elements[j]) 
	                {
	                    temp = elements[i];
	                    elements[i] = elements[j];
	                    elements[j] = temp;
	                }
	            }
	        }
			
			for(int j=0 ; j<elements.length-1;j++){
				
				System.out.print(elements[j]+",");
			}
			
			System.out.print(elements[lan - 1]);
			
		}
	 
	 
	public void fizzBuz(){
		
		System.out.println("The FizzBuzz Starts:");
		
		for(int i = 1; i <= 50; i++) {                    
		      if (((i % 5) == 0) && ((i % 3) == 0))            
		        System.out.print("fizzbuzz");
		      
		      else if ((i % 5) == 0) 
		    	  System.out.print("fizz"); 
		      
		      else if ((i % 3) == 0) 
		    	  System.out.print("buzz"); 
		      
		      else System.out.print(i);                        
		      System.out.print(" "); 
		    }
		    System.out.println();
			
		}
		
	public void decimalBinary(){
			
			
		}
	 
	 

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		TodayTask tsk=new TodayTask();
		
		System.out.println("Enter The Input Number");
		
		int num=scan.nextInt();
		tsk.revNumber(num);
		
		System.out.println("Enter Length Of Array:");
		
		int lan=scan.nextInt();
		
		int[] elements=new int[lan];
		
		for(int i=0;i<elements.length;i++){
			
			elements[i]=scan.nextInt();
			//System.out.println("ARR In"+elements[i]);
		}
		
		
		
		tsk.bubbleSort(elements,lan);
		
		tsk.fizzBuz();
		
	}

}
