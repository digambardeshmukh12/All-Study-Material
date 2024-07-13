package mypack;

public class Book {

	int bid1;
	String bname1;
	int bprice1;
	public int getBid1() {
		return bid1;
	}
	public void setBid1(int bid1) {
		this.bid1 = bid1;
	}
	public String getBname1() {
		return bname1;
	}
	public void setBname1(String bname1) {
		this.bname1 = bname1;
	}
	public int getBprice1() {
		return bprice1;
	}
	public void setBprice1(int bprice1) {
		this.bprice1 = bprice1;
	}
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int bid1, String bname1, int bprice1) {
		super();
		this.bid1 = bid1;
		this.bname1 = bname1;
		this.bprice1 = bprice1;
	}
	@Override
	public String toString() {
		return "Book [bid1=" + bid1 + ", bname1=" + bname1 + ", bprice1=" + bprice1 + "]";
	}
	
	
}
