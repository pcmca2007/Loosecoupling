package com.coupling.loosecoupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
    	
    	ApplicationContext context= new FileSystemXmlApplicationContext("beans.xml");
    	
    	Traveller traveller = (Traveller) context.getBean("traveller");
    	traveller.setKmTravelled(20);
    	
    	System.out.println("Travel History="+traveller.getTravelDetails());
    }
}
