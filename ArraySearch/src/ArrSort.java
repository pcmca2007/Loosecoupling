import static org.junit.Assert.*;

import org.junit.Test;


public class ArrSort {

	@Test
	public void test() {
		
		Sort s= new Sort();
		int[] arr=s.sortAscArr(4);
		assertArrayEquals(new int[]{4,12,22,55}, arr);
	}

}
