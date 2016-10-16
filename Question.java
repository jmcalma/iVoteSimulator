//Jerahmeel Calma
//CS356 Assignment 1
package iVoteSimulator;

/*
 * Each student's choice is stored in
 * a boolean array in which each answer,
 * corresponding to a certain index in the
 * array, is marked true.
 */
public class Question {

	private boolean[] answers;
	
	public Question() {
		answers = new boolean[2];
	}
	
	public Question(int size) {
		answers = new boolean[size];
	}
	
	public boolean getChoice(int index) {
		return answers[index];
	}
	
	public boolean[] getAnswers() {
		return answers;
	}
	
	public void setChoice(int index, boolean tf) {
		answers[index] = tf;
	}
	
	public int getSize() {
		return answers.length;
	}
}
