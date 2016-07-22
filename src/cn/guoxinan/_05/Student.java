package cn.guoxinan._05;

import java.util.Date;

public class Student {
	private int num;
	private String name;
	private String sex;
	private int age;
	private Date birthday;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>0&&age<=120)
		this.age = age;
		else System.out.println("age yichu");
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	
}
