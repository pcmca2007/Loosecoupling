package studentsRecords;

import java.util.*;

public class QueueThread implements Runnable {
	
	Scanner scan = new Scanner(System.in);
	QueueOperations qo;
	Thread queue;
	
	public QueueThread(QueueOperations qo) {
		
		this.qo = qo;
		queue = new Thread(this);
		System.out.println("Push Thread"+queue);
		queue.start();
	}
	
	public void run(){
		
		System.out.println("Enter Number To Push:");
		
		try{
			qo.insert(scan.nextInt());
			Thread.sleep(1000);
		}catch(Exception e){
			
			System.out.println("Exception While Pushing:"+e.getMessage());
		}
		
		
		
	}
	

}
