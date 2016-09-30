package studentsRecords;

import java.util.NoSuchElementException;

public class QueueOperations {
	
	
	protected int[] queue;
	protected int front,rear,size,len;
	
	public QueueOperations(int n) {
		
		size=n;
		front=-1;
		rear=-1;
		len=0;
		queue=new int[size];
		
		
	}
	
	public synchronized boolean isEmpty(){
		
		return front==-1;
	}
	
	
	
	public synchronized void insert(int n){
		
		System.out.println("In Insert");
		
		if(rear==-1){
			
			rear=0;
			front=0;
			
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				System.out.println("Error In First Push:"+e.getMessage());
			}
			
			queue[rear] = n;
			
			System.out.println("Queue First Time:"+queue[rear]);
			
		}else if(rear +1 >= size)
			
			throw new ArrayIndexOutOfBoundsException("OverFlow Exception");
		
		else if(rear +1 < size){
			
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				System.out.println("Error In Later Push:"+e.getMessage());
			}
			
			queue[++rear]= n;
			
			
		}
		System.out.println("Pushed element is:");
		display();
		len++;
		
		
	}
	
	public int remove(){
		
		System.out.println("In Remove");
		
		if(isEmpty())
			
			throw new NoSuchElementException("UnderFlow Exception");
		
		else{
			
			int ele= queue[front];
			
			if(front == rear){
				
				front=-1;
				rear=-1;
				
			}else{
				
				front++;
			}
			
			len--;
			
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				System.out.println("Error In Pop:"+e.getMessage());
			}
			
			System.out.println("After pop Element is:");
			display();
			
			return ele;
		}
		
		
			
		}
	
		public void display(){
		
			if(len==0){
				
				System.out.println("Empty Queue");
				return;
		}else{
			
			for(int i=0 ; i< len ; i++){
				
				System.out.print(queue[i]+" ");
		        System.out.println();  
			}
			
		}
		
		}

}
