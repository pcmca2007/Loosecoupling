package MyPackage;


import java.util.NoSuchElementException;

public class ArrayQueue {
	
	protected int[] queue;
	protected int front,rear,size,len;
	
	public ArrayQueue(int n) {
		
		size=n;
		front=-1;
		rear=-1;
		len=0;
		queue=new int[size];
		
		
	}
	
	public boolean isEmpty(){
		
		return front==-1;
	}
	
	public boolean isFull(){
		
		return front==0 && rear + 1 == size;
	}
	
	public int isPeek(){
		
		if(isEmpty()){
			
			throw new NoSuchElementException("Not A Single Element found In Queue");
		}else
				return queue[front];
			
	}
	
	public int getSize()
    {
        return len ;
    }  
	
	
	public void insert(int n){
		
		if(rear==-1){
			
			rear=0;
			front=0;
			queue[rear] = n;
			
			System.out.println("Queue First Time:"+queue[rear]);
			
		}else if(rear +1 >= size)
			
			throw new ArrayIndexOutOfBoundsException("OverFlow Exception");
		
		else if(rear +1 < size){
			
			queue[++rear]= n;
			
			System.out.println("Queue Next Time:"+queue[rear]);
		}
		
		len++;
		System.out.println("Length="+len);
		
	}
	
	public int remove(){
		
		
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
