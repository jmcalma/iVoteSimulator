package iVoteSimulator;
import java.util.*;

public class Student {
	
	private ArrayList<String> roster;
	
	public Student() {
		roster = new ArrayList<String>();
	}
	
	public ArrayList<String> getID() {
		return roster;
	}
	
	public String getID(int index){
		return roster.get(index);
	}
	
	public void setID(String name){
		roster.add(name);
	}
	
	public int getSize(){
		return roster.size();
	}
}
