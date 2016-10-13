package iVoteSimulator;

public class MultiQuestion {
	
	private boolean[] answers;
	
	public MultiQuestion() {
		answers = new boolean[4];
	}
	
	public boolean getA() {
		return answers[0];
	}
	
	public boolean getB() {
		return answers[1];
	}
	
	public boolean getC() {
		return answers[2];
	}
	
	public boolean getD() {
		return answers[3];
	}
	
}
