package mypack;

public class contract_employee extends employee {

	int pay_per_hour , contract_duration;

	public int getPay_per_hour() {
		return pay_per_hour;
	}

	public void setPay_per_hour(int pay_per_hour) {
		this.pay_per_hour = pay_per_hour;
	}

	public int getContract_duration() {
		return contract_duration;
	}

	public void setContract_duration(int contract_duration) {
		this.contract_duration = contract_duration;
	}
	
	
}
