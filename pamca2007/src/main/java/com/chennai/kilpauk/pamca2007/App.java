package com.chennai.kilpauk.pamca2007;

import java.util.Collection;
import java.util.HashSet;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Students std1=new Students(101, "Abhishek", "B.Tech");
    	Students std2=new Students(100, "Abhishek", "B.Tech");
    	Students std3=new Students(102, "Prabhash", "MCA");
    	Students std4=new Students(101, "Abhishek", "B.Tech");
    	
    	/*System.out.println("std1="+std1.hashCode());
    	System.out.println("std2="+std2.hashCode());
    	System.out.println("std3="+std3.hashCode());
    	System.out.println("std4="+std4.hashCode());*/
    	
    	Collection<Object> set= new HashSet<Object>();
    	
    	System.out.println(set.add(std1));
    	System.out.println(set.add(std2));
    	System.out.println(set.add(std3));
    	System.out.println(set.add(std4));
    	
    	Students s1=new Students(112 , " ", " ");
    	
    	System.out.println("Search="+set.contains(std1));
    }
}
