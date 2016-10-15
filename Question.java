package iVoteSimulator;

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
