package MyPackage;

import java.util.*;

public class QueueImplement {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws java.io.IOException {
		// TODO Auto-generated method stub
		char ch;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the size of the Queue");
		
		int n= scan.nextInt();
		
		ArrayQueue aq=new ArrayQueue(n);
		
		do{
			
			System.out.println("\n Queue Operations:");
			System.out.println("1. Insert");
			System.out.println("2. Remove");
			System.out.println("3. Peek ");
			System.out.println("4. Check Empty"); 
			System.out.println("5. Check Full");
			System.out.println("6.Queue Length");
			System.out.println("7. Display queue");
			
			System.out.println("Select A Choice From Menue:");
			
			int choice = scan.nextInt();
			
			switch(choice){
				
				case 1:
						System.out.println("Enter The Element to Insert");
					
					try{
							aq.insert(scan.nextInt());
							
					}catch(Exception e){
						
						System.out.println("Exception Occurs While Inserting:"+e.getMessage());
					}
					
					break;
					
				case 2:
					    try{
					    	
					    	System.out.println("Removed Elelement:"+aq.remove()); 
					    	
					    }catch(Exception e){
					    	
					    	System.out.println("Exception Occurs While Removing:"+e.getMessage());
					    }
					    
					    break;
					    
				case 3:
					
					try{
						
						System.out.println("Peek Elelement:"+aq.isPeek()); 
						
					}catch(Exception e){
						
						System.out.println("Exception While Showing Peek:"+e.getMessage());
					}
					
					break;
					
				case 4:
					
					System.out.println("Empty Status:"+aq.isEmpty()); 
					break;
					
				
				case 5:
						System.out.println("Full Status:"+aq.isFull()); 
						break;
						
				case 6:
						System.out.println("Queue Size:"+aq.getSize()); 
						break;
						
				case 7:
						aq.display();
						break;
						
				default :
						System.out.println("Wrong Entry:\n");
						break;
									
			}
			
			System.out.println("\nDo you want to continue (Type y or n) \n");
			
			ch= (char) System.in.read();
			
			if(ch != 'y' || ch != 'n')
				
				System.out.println("Wrong Entry:\n");

		}while(ch == 'y' || ch == 'n');
		
		
		

	}

}
