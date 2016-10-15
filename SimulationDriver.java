package iVoteSimulator;
import java.util.*;

public class SimulationDriver {

	public static void main(String[] args){
		
		Question q1;
		System.out.println("The answer choices are A B");
		
		int numStudents1 = (int)(Math.random() * 100 + 1);
		Student roster1 = new Student();
		String[] choices1 = {"1", "2"};  
		Random rand1 = new Random();
		int pick1;
		Hashtable<String, boolean[]> submissions1 = new Hashtable<String, boolean[]>();
		for(int i = 0; i < numStudents1; i++) {
			q1 = new SingleQuestion();
			roster1.setID(Integer.toString(i));
			pick1 = rand1.nextInt(2);
			if(choices1[pick1].equals("1")) {
				q1.setChoice(0, true);
			}else {
				q1.setChoice(1, true);
			}
			submissions1.put(Integer.toString(i), q1.getAnswers());
		}
		
		q1 = new SingleQuestion();
		iVoteService iv = new iVoteService(q1, roster1.getID(), submissions1);
		iv.output();
		
		
		/*
		Question q2;
		System.out.println();
		System.out.println("The answer choices are A B C D");
		
		int numStudents2 = (int)(Math.random() * 100 + 1);
		Student roster2 = new Student();
		String[] choices2 = {"1", "2", "3", "4"};
		Random rand2 = new Random();
		int pick2;
		int howMany = (int)(Math.random() * 4 + 1);
		Hashtable<String, boolean[]> submissions2 = new Hashtable<String, boolean[]>();
		for(int i = 0; i < numStudents2; i++) {
			q2 = new MultiQuestion(4);
			roster2.setID(Integer.toString(i));
			for(int j = 0; j < howMany; j++){
				pick2 = rand2.nextInt(4);
				if(choices2[pick2].equals("1")) {
					q2.setChoice(0, true);
				}else if(choices2[pick2].equals("2")){
					q2.setChoice(1, true);
				}else if(choices2[pick2].equals("3")){
					q2.setChoice(2, true);
				}else {
					q2.setChoice(3, true);
				}
			}
			submissions2.put(Integer.toString(i), q2.getAnswers());
		}
		
		q2 = new MultiQuestion(4);
		iVoteService iv = new iVoteService(q2, roster2.getID(), submissions2);
		iv.output();
		*/
	}
}
