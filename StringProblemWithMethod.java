/**
Created on Dec 1, 2016

@author: Jacky Yu
**/
package AppleTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class StringProblemWithMethod {
	
	public static String reChar(String str, char re){
        StringBuilder sb = new StringBuilder();
        char[] charArray = str.toCharArray();
        for(int i=0; i<charArray.length; i++){
            if (charArray[i] == re){} //do nothing
            else sb.append(charArray[i]);
        }
        return sb.toString(); //return result
	}
	
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
		try
	    {
			String str = "Thi#s i#s a very long stri#ng t####hat I ha#ve #ever seen.#";
			char re = '#';
			System.out.println("\nCase1:\nThe original string: "+str);
			System.out.println("Remove \"#\" and the result:"+reChar(str,re));
	    }catch(Exception e){
	    	System.out.println("Bad input:"+e);
	    	Assert.fail("Exception was thrown",e);
	    }
	  }
	
	// Test case2: Negative test.
	@Test (priority = 2)
	  public void negativeTest() {
		try
	    {
			String str = null;
			char re = '#';
			System.out.println("\nCase2:\nThe original string: "+str);
			System.out.println("Remove \"#\" and the result:"+reChar(str,re));
	    }catch(Exception e){
	    	System.out.println("Bad input:"+e);
	    	Assert.fail("Exception was thrown",e);
	    }
	  }
}
