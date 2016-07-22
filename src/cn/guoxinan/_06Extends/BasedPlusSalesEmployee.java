package cn.guoxinan._06Extends;

public class BasedPlusSalesEmployee extends SalerEmployee{
	private double dixing;

	public double getDixing() {
		return dixing;
	}

	public void setDixing(double dixing) {
		this.dixing = dixing;
	}

	public BasedPlusSalesEmployee(String name, int birthday_month, int birthday_day, double monthsales, double ticheng,
			double dixing) {
		super(name, birthday_month, birthday_day, monthsales, ticheng);
		super.setMoney(monthsales*ticheng+dixing);
		this.dixing = dixing;
	}
	public void getSalary(int month) {
		if (super.getBirthday_month() == month) {
			super.setMoney(super.getMoney() + 100);
		}
	}
	
	
}
