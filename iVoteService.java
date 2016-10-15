package iVoteSimulator;
import java.util.*;

public class iVoteService {
	
	Hashtable<String, boolean[]> submissions;
	Question q;
	private int[] results;
	private ArrayList<String> names;
	
	public iVoteService(Question type, ArrayList<String> roster, Hashtable<String, boolean[]> data) {
		q = type;
		submissions = data;
		results = new int[type.getSize()];
		names = roster;
	}
	
	private void countResults() {
		boolean[] choices;
		for(int i = 0; i < names.size(); i++) {
			choices = submissions.get(names.get(i));
			for(int j = 0; j < q.getSize(); j++) {
				if(choices[j] == true){
					results[j]++;
				}
			}
		}
	}
	
	public void output() {
		countResults();
		char letter = 'A';
		for(int i = 0; i < results.length; i++){
			letter += i;
			System.out.println(letter + ": " + results[i]);
		}
		System.out.println("Number of submissions: " + names.size());
	}
	
}
