/**
Created on Dec 1, 2016

@author: Jacky Yu
**/

import java.util.*;
public class StringProblem {
	
	//Remove Char method
	public static String reChar(String str, char re){
        StringBuilder sb = new StringBuilder();
        char[] charArray = str.toCharArray();
        for(int i=0; i<charArray.length; i++){
            if (charArray[i] == re){} //do nothing
            else sb.append(charArray[i]);
        }
        return sb.toString(); //return result
	}
	
	// Main method
	public static void main(String[] args) {
		String str = "Thi#s i#s a very long stri#ng t####hat I ha#ve #ever seen.#";
		char re = '#';
		System.out.println(reChar(str,re));
	}
}
