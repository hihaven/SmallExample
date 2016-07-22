package cn.guoxinan._06Extends;

import java.util.Date;

public class SalariedEmployee extends Employee{
	private double monthlyPay;
	private int month;
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public double getMonthlyPay() {
		return monthlyPay;
	}
	public void setMonthlyPay(double monthlyPay) {
		this.monthlyPay = monthlyPay;
	}
	public SalariedEmployee(){}
	public SalariedEmployee(int monthlyPay) {
		super();
		this.setMonthlyPay(monthlyPay);
	}
	public SalariedEmployee(String name,int birthday_month,int birthday_day,double monthlyPay){
		super(name,birthday_month,birthday_day,monthlyPay);
		this.setMonthlyPay(monthlyPay);
	}
	public void getSalary(int month){
		if(super.getBirthday_month()==month){
			this.setMonthlyPay(this.getMonthlyPay()+100);
			super.setMoney(this.getMonthlyPay());
		}else {super.setMoney(this.getMonthlyPay());this.setMonthlyPay(monthlyPay);}
	}
	
	
}
