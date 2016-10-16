//Jerahmeel Calma
//CS356 Assignment 1
package iVoteSimulator;
import java.util.*;

/*
 * Each student's unique ID is stored
 * in an arraylist.
 */
public class Student {
	
	private ArrayList<String> roster;
	
	public Student() {
		roster = new ArrayList<String>();
	}
	
	public ArrayList<String> getID() {
		return roster;
	}
	
	public String getID(int index) {
		return roster.get(index);
	}
	
	public void setID(String name) {
		roster.add(name);
	}
	
	public int getSize() {
		return roster.size();
	}
}
