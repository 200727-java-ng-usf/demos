package com.revature.structures.util;

import junit.framework.TestCase;
import org.junit.Before;

import java.util.Random;

import static java.time.LocalDate.now;

public class CustomLinkedListTest extends TestCase {
	CustomLinkedList<String> customLinkedList = new CustomLinkedList<>();
	Random random;


	public String getRandomString(int seed){
//		if(seed == 0) seed = now();
		random.setSeed(seed);
		return "";
	}

	@Before
	public void setupCustomLinkedList(){
		customLinkedList = new CustomLinkedList<>();
	}

	public void testInsert() {

//		customLinkedList.insert();
	}

	public void testPeek() {
	}

	public void testPoll() {
	}

	public void testRemoveByKey() {
	}

	public void testRemoveDuplicatesOf() {
	}

	public void testPrintList() {
	}
}