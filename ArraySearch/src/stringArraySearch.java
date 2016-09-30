import java.util.Scanner;

public class stringArraySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Length Of Array:");
		int lan=scan.nextInt();
		System.out.println(lan);
		
		Sort s= new Sort();
		int[] arr=s.sortAscArr(lan);
		
		System.out.println("Enter Value to be Searched");
		int search=scan.nextInt();
		s.binarySearch(arr,search);
		
	}

}

class Sort{
	
	private int[] elements=null;
	private int len;
	Scanner scan=new Scanner(System.in);
	
	public int[] sortAscArr(int len){
		
		int temp,hold;
		
		this.len=len;
		System.out.println("Enter Length Of Array is:"+len);
		elements=new int[len];
		
		for(int i=0;i<elements.length;i++){
									
			elements[i]=scan.nextInt();
			//System.out.println("ARR In"+elements[i]);
		}
		
		for (int i = 0; i < len; i++) 
        {
            for (int j = i + 1; j < len; j++) 
            {
                if (elements[i] > elements[j]) 
                {
                    temp = elements[i];
                    elements[i] = elements[j];
                    elements[j] = temp;
                }
            }
        }
       /* System.out.print("Ascending Order:");
        for (int i = 0; i < len - 1; i++) 
        {
            System.out.print(elements[i] + ",");
        }
        System.out.print(elements[len - 1]);*/
		
			return elements;
		 }
	
		public int binarySearch(int[] arr,int search){
			
			/*for (int i = 0; i < arr.length - 1; i++) 
	        {
	            System.out.print(elements[i] + ",");
	        }
	        System.out.print((elements[arr.length - 1])+" "+search);*/
			
		int first=0;
		int last=arr.length-1;
		int middle=(first+last)/2;
		
		while(first <= last){
			
			if(arr[middle] < search)
			
				first=middle+1;
			else if(arr[middle]== search){
				//System.out.println(search + " found at location " + (middle + 1) + ".");
				int i=arr[middle];
				return i ;
		       // break;
			}else
				last=middle+1;
			
			middle=(first+last)/2;
				
			
		}
			
		if(first>last)	
			System.out.println(search + " is not present in the list.\n");
		return 0;
			
		}
	
					
		}
		
		
	
	
	
