package iVoteSimulator;

public class SingleQuestion {

	private boolean right;
	private boolean wrong;
	
	public SingleQuestion(){
		right = false;
		wrong = false;
	}
	
	public boolean getRight(){
		return right;
	}
	
	public boolean getWrong(){
		return wrong;
	}
}
