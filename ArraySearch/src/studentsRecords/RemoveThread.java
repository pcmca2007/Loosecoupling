package studentsRecords;


public class RemoveThread implements Runnable {
	
	QueueOperations qo;
	Thread queue;
	
	public RemoveThread(QueueOperations qo) {
		
		this.qo = qo;
		queue = new Thread(this);
		System.out.println("Remove Thread"+queue);
		queue.start();
	}
	
	public void run(){
		
		
		try{
	    	
			qo.remove();
	    	Thread.sleep(1000);
	    }catch(Exception e){
	    	
	    	System.out.println("Exception Occurs While Removing:"+e.getMessage());
	    }
	}

}
