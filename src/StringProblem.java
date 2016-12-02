/**
Created on Dec 1, 2016

@author: Jacky Yu
**/

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class StringProblem {
	@BeforeClass
	  public void beforeClass() {
		System.out.println("Welcome to use char remover");
		System.out.println("===========================");
	  }	
	@AfterClass
	  public void afterClass() {
		System.out.println("===========================");
		System.out.println("See you~!");
	  }
	// Test case1: Positive test.
		@Test (priority = 1)
		  public void positiveTest() {
			String str = "Thi#s i#s a very long stri#ng t####hat I ha#ve #ever seen.#";
			System.out.println("\nCase1:\nThe original string: "+str);
			str= str.replace("#","");
			System.out.println("Remove \"#\" and the result:"+str);
		  }
		
		// Test case2: Negative test.
		@SuppressWarnings("null")
		@Test (priority = 2)
		  public void negativeTest() {
			String str = null;
			System.out.println("\nCase2:\nThe original string: "+str);
			try
		    {
				str= str.replace("#","");
		    }catch (NullPointerException ex)
			{	
		    	System.out.println("Bad input:"+ex);
		    	Assert.fail("NullPointerException was thrown",ex);
			}
		  }

}
