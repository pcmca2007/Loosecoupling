import static org.junit.Assert.*;

import org.junit.Test;


public class ArrSearch {

	@Test
	public void test() {
		//int[] arr=null;
		Sort s = new Sort();
		int i=s.binarySearch(new int[]{12,5,77,32,77}, 32);
		// arr[0] = i;
		
		 assertArrayEquals(new int[i],new int[]{12,5,77,32,77} );
	
	}

}
