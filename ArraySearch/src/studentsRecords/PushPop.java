package studentsRecords;

import java.util.*;

public class PushPop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Size Of Array:");
		
		final int len= scan.nextInt();
		
		final QueueOperations qo = new QueueOperations(len);
		//QueueThread qt = new QueueThread(qo);
		//RemoveThread rt = new RemoveThread(qo);
		
		
		
		
		
		for(int i=0 ; i < len ; i++){
			
			System.out.println("Enter The Number to Insert:");
			final int n=scan.nextInt();
		
		
		(new Thread("Pusher"){
			
			public void run(){
				///for(int i=0; i<len ;i++){	
					
					qo.insert(n);
			//}
		}
		}).start();
		
		}
		
(new Thread("Poper"){
			
			public void run(){
				for(;;){
					
					int n=qo.remove();
					System.out.println("Poped Element Is:"+n);
					
			}
		}
		}).start();
				
		

	}

}
