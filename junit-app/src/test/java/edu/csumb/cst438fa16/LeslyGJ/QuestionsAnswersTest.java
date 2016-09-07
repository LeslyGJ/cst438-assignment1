package edu.csumb.cst438fa16.LeslyGJ;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit test for QuestionsAnswers
 */
public class QuestionsAnswersTest extends QuestionsAnswers
{
	
	@Test
	public void test() {
		QuestionsAnswers checkQA = new QuestionsAnswers();
		
		//add question and answer to hashmap
		checkQA.put("Is the sum of one and one, two?", "Yes");
		checkQA.put("What year is it?", "2016");
	    
	    //test that questions matches answers
	    assertEquals(true, checkQA.testAnswer("Is the sum of one and one, two?", "Yes"));
	    assertEquals(false, checkQA.testAnswer("What year is it?", "2015"));

		}
}
