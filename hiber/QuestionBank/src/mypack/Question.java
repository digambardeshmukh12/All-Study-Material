package mypack;

import java.util.Iterator;
import java.util.List;

public class Question {
	
	private int qid ;
	private String qname ;
	private List<String> ans ;
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question(int qid, String qname, List<String> ans) {
		super();
		this.qid = qid;
		this.qname = qname;
		this.ans = ans;
	}
	
	public void display() {
		System.out.println(qid + "  " + qname);
		Iterator it = ans.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}
	
	

}
