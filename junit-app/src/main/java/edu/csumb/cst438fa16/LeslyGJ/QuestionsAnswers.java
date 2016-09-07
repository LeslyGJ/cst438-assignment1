package edu.csumb.cst438fa16.LeslyGJ;
import java.util.*;

/**
* A half-secretive map of questions to answers (at most one answer per question). * Gives out random questions (keys) from the map, and
* can be queried to test if a given question maps to a given answer.
*/

public class QuestionsAnswers 
{
	HashMap<String, String> questions = new HashMap<String, String>();
	
	/**
	 * Maps question to answer.
	 * create hash map & put things in hash
	 */
	
	void put(String question, String Answer)
	{
		questions.put(question, Answer);
	}
	
	/**
	 * Queries if question maps to answer.
	 * question matches answer?
	 */
    boolean testAnswer(String question, String answer)
    {
    	if(questions.get(question).equals(answer)){
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    /**
     * Gives out a random question from the key set.
     * return random question
     */
    String getRandomQuestion()
    {
    	Object[] theQuestions = questions.keySet().toArray();
    	Object aQuestion = theQuestions[new Random().nextInt(theQuestions.length)];
    	
    	return (String) aQuestion;
    }
}
