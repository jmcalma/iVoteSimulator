//Jerahmeel Calma
//CS356 Assignment 1
package iVoteSimulator;

public class SingleQuestion extends Question{
	
	public SingleQuestion() {
		super();
	}
	
	/*
	 * If a student wants to change their answer, they
	 * can resubmit their answer and the submission
	 * will be updated.
	 */
	public void setChoice(int index) {
		if(getChoice(0) == false && getChoice(1) == false) {
			setChoice(index, true);
		}else if(index == 0 && getChoice(1) == true) {
			setChoice(index, true);
			setChoice(1, false);
		}else if(index == 1 && getChoice(0) == true) {
			setChoice(index, true);
			setChoice(0, false);
		}
	}
	
}
