package cn.guoxinan._06Extends;

public class SalerEmployee extends Employee{
	private double monthsales;
	private double ticheng;
	public double getMonthsales() {
		return monthsales;
	}
	public void setMonthsales(double monthsales) {
		this.monthsales = monthsales;
	}
	public double getTicheng() {
		return ticheng;
	}
	public void setTicheng(double ticheng) {
		this.ticheng = ticheng;
	}
	public SalerEmployee(String name, int birthday_month, int birthday_day, double monthsales,
			double ticheng) {
		super(name, birthday_month,birthday_day);
		super.setMoney(monthsales*ticheng);
		this.monthsales = monthsales;
		this.ticheng = ticheng;
	}
	public void getSalary(int month) {
		if (super.getBirthday_month() == month) {
			super.setMoney(super.getMoney() + 100);
		}
	}
}
