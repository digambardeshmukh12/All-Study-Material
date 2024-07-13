package produmypack;

import javax.persistence.*;
@Entity @Table(name="prod")
public class product {

	@Id @GeneratedValue(generator="increment")
	@Column(name="code")
	int pcode;
	
	@Column(name="Name")
	String pname;
	
	
	
	@Column(name="Rate")
	int prate ;



	public int getPcode() {
		return pcode;
	}



	public void setPcode(int pcode) {
		this.pcode = pcode;
	}



	public String getPname() {
		return pname;
	}



	public void setPname(String pname) {
		this.pname = pname;
	}



	public int getPrate() {
		return prate;
	}



	public void setPrate(int prate) {
		this.prate = prate;
	}
	
	
	
	
}
