package cn.guoxinan._06Extends;

public class HourlyEmployee extends Employee {
	private double dayMoney;
	private double hourses;

	public double getDayMoney() {
		return dayMoney;
	}

	public void setDayMoney(double dayMoney) {
		this.dayMoney = dayMoney;
	}

	public double getHourses() {
		return hourses;
	}

	public void setHourses(double hourses) {
		this.hourses = hourses;
	}

	public HourlyEmployee(String name, int birthday_month, int birthday_day,double dayMoney,
			double hourses) {
		
		super(name, birthday_month,birthday_day);
		if(hourses<=160)super.setMoney(dayMoney*hourses);else super.setMoney(dayMoney*160+dayMoney*1.5*(hourses-160));
		this.dayMoney = dayMoney;
		this.hourses = hourses;
	}

	public void getSalary(int month) {
		if (super.getBirthday_month() == month) {
			super.setMoney(super.getMoney() + 100);
		}
	}

}
