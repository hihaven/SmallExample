package cn.guoxinan._04;

public class Student {
	public String name;
	public String sex;
	public int age;
	public int ID;
	public double weight;
	public double high;
	public Student(){}
	public Student(String name, String sex, int age, int iD, double weight,double high) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
		ID = iD;
		this.weight = weight;
		this.high=high;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", sex=" + sex + ", age=" + age + ", ID=" + ID + ", weight=" + weight
				+ ", high=" + high + ", weight_=" + weight + "]";
	}

	public double weight_high(){
		return this.high/this.weight;
	}
	public boolean high_other(double high){
		if(this.high>high)return true;
		else return false;
	}
	public String high_two(Student args1,Student args2){
	 double a=	this.high>args1.high?this.high:args1.high>args2.high?this.high>args1.high?this.high:args1.high:args2.high;
	 	if(a==this.high)return this.name;
	 	else if(a==args1.high)return args1.name;
	 	else if(a==args2.high)return args2.name;
	 	return null;
	}
	
}
