package cn.guoxinan._06Extends;

import java.util.Date;

public class Employee {
	private String name;
	private int birthday_month;
	private int birthday_day;
	private double money;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBirthday_month() {
		return birthday_month;
	}
	public void setBirthday_month(int birthday_month) {
		this.birthday_month = birthday_month;
	}
	public int getBirthday_day() {
		return birthday_day;
	}
	public void setBirthday_day(int birthday_day) {
		this.birthday_day = birthday_day;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", birthday_month=" + birthday_month + ", birthday_day=" + birthday_day
				+ ", money=" + money + "]";
	}
	public Employee(String name, int birthday_month, int birthday_day, double money) {
		super();
		this.name = name;
		this.birthday_month = birthday_month;
		this.birthday_day = birthday_day;
		this.money = money;
	}
	
	public Employee(String name, int birthday_month, int birthday_day) {
		super();
		this.name = name;
		this.birthday_month = birthday_month;
		this.birthday_day = birthday_day;
	}
	public Employee() {
		super();
	}
	
	 
	
}
