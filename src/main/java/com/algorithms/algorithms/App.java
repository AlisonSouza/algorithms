package com.algorithms.algorithms;

import java.util.LinkedHashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

/**
 * Hello world!
 *
 */
public class App 
{
	@Test
	public void shouldReturnItem3Item4Item5() {
		String[][] item = {{"Item1", "Item2"},
				{"Item3", "Item4"},
				{"Item4", "Item5"}};
		
		String[] expected = {"Item3", "Item4", "Item5"};
		
		Assert.assertEquals(expected, largestItemAssociation(item));
	}
	
	@Test
	public void shouldReturnItem1Item2() {
		String[][] item = {{"Item1", "Item2"},
				{"Item3", "Item4"}};
		
		String[] expected = {"Item1", "Item2"};
		
		Assert.assertEquals(expected, largestItemAssociation(item));
	}
	
	@Test
	public void shouldReturnNullWhenParameterIsNull() {
		String[][] item = null;
		Assert.assertNull(largestItemAssociation(item));
	}
	
    	public String[] largestItemAssociation(String[][] itemAssociation) {
    		
    		if(itemAssociation == null || itemAssociation.length == 0) return null;
    		
    		String[] group1 = new String[0];
    		String[] group2 = new String[0];
    		for (int i=0; i < itemAssociation.length-1 ; i++){
        		if(itemAssociation[i][1] != itemAssociation[i+1][0]) {
        			group1 = new String[2];
        			group1[i] = itemAssociation[i][i];
        			group1[i+1] = itemAssociation[i][1];
        		} else if(itemAssociation[i][1] == itemAssociation[i+1][0]) {
        			group2 = new String[3];
        			group2[0] = itemAssociation[i][i-1];
        			group2[1] = itemAssociation[i][i];
        			group2[2] = itemAssociation[i+1][1];
        		}
    		}
    		
    		return group1.length > group2.length ? group1: group2;
    	}
}
