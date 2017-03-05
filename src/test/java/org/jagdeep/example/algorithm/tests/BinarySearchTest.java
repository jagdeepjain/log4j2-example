package org.jagdeep.example.algorithm.tests;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jagdeep.example.algorithm.BinarySearch;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {
	static Logger log = LogManager.getLogger(BinarySearchTest.class.getName());
	
	@Test
	@DisplayName("Positive Test for binary search with even size of the list of numbers.")
    public void testApp()
    {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		int number = 3;
    	log.info("Number to be search in the given list # {} ", number);
		BinarySearch bs = new BinarySearch();
    	int expectedValue = bs.binarySearch(list, number);
    	log.info("Number found on the given list # {} ", list.get(expectedValue));
    	assertThat(3).isEqualTo(list.get(expectedValue));	
    }
}
