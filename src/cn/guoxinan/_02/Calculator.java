package cn.guoxinan._02;

public class Calculator {
	private double num1;
	private double num2;

	public Calculator() {
	}

	public Calculator(double num1, double num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	public double Calculate(int i) {
		double doub=0;
		char cr = 0;
		switch (i) {
		case 1:
			doub= add();
			cr='+';
			break;
		case 2:
			doub= minus();
			cr='-';
			break;
		case 3:
			doub=multiply();
			cr='*';
			break;
		case 4:
			doub= divide();
			cr='/';
			break;
		}
		System.out.println(""+num1+cr+num2+"="+doub);
		return doub;
	}

	public double add() {
		return this.num1 + this.num2;
	}

	public double minus() {
		return this.num1 - this.num2;
	}

	public double multiply() {
		return this.num1 * this.num2;
	}

	public double divide() {
		if (num2 != 0)
			return num1 / num2;
		else
			return 0;
	}
}
