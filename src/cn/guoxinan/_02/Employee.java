package cn.guoxinan._02;

public class Employee {
	private int num;
	private String name;
	private int age;
	private String email;
	private String address;
	private String sex;
	private Employee(){}
	private Employee(int num, String name, int age, String email, String address, String sex) {
		super();
		this.num = num;
		this.name = name;
		this.age = age;
		this.email = email;
		this.address = address;
		this.sex = sex;
	}
	private static  Employee employee;
	public static synchronized Employee  getEmployee(){
		if(employee==null)
			employee=new Employee();
		return employee;
	}
	public static synchronized Employee  getEmployee(int num, String name, int age, String email, String address, String sex){
		if(employee==null)
			employee=new Employee(num,name,age,email,address,sex);
		return employee;
	}
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public static void setEmployee(Employee employee) {
		Employee.employee = employee;
	}
	
}
