package com.spring.core.helloworld;

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
    	ApplicationContext contaxt= new FileSystemXmlApplicationContext("NewFile.xml");
    	HelloWorld hell=(HelloWorld) contaxt.getBean("hello");
    	
        System.out.println( "Hello World!"+hell.helloWorld() );
    }
}
