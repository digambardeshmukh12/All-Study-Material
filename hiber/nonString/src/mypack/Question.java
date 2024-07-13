package mypack;

import java.util.*;

public class Question {
	private int qid ;
	private String qname ;
	private List<Answer> li;
	
	
	public void setQid(int qid) {
		this.qid = qid;
	}
	public void setQname(String qname) {
		this.qname = qname;
	}
	public void setLi(List<Answer> li) {
		this.li = li;
	}
	
	
	void display() {
		
		System.out.println("QId=" + qid + " QName=" + qname);
		System.out.println("Answers are :");
		
		Iterator it = li.iterator();
		while(it.hasNext()) {
			
			
			Answer an = (Answer) it.next();
			System.out.println(an);
		}
		
	}
	
	

}
