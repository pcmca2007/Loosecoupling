package MyPackage;

import java.io.*;
import java.util.*;

public class RevString {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Enter Input String");
		
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String str=br.readLine();
		
		byte[] strAsByteArray= str.getBytes();
		byte[] result= new byte[strAsByteArray.length]; 
		
		for(int i=0 ; i < strAsByteArray.length ; i++){
			
			result[i] = strAsByteArray[strAsByteArray.length-i-1];
			
		}
		
		System.err.println("Reversed Array="+new String(result));
	}
}