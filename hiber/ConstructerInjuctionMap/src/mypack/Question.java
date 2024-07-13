package mypack;

import java.util.*;
import java.util.Map.*;


public class Question {
	
	int qid ;
	String qname ;
	Map<String,String> map;
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question(int qid, String qname, Map<String, String> map) {
		super();
		this.qid = qid;
		this.qname = qname;
		this.map = map;
	}
	
	public void display() {
		System.out.println(qid + " " + qname);
		Set<Entry<String,String>> s = map.entrySet();
		Iterator <Entry<String,String>> itr = s.iterator();
		while(itr.hasNext()) {
			Entry<String,String> e = itr.next();
			System.out.println("Answer Name=" + e.getKey() + "\n Posted by =" + e.getValue());
			
		}
	}
	

}
