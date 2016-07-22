package cn.guoxinan._06Extends;

import java.util.Date;

public class Test3 {
	public static void main(String[] args) {

		SalariedEmployee sa = new SalariedEmployee("บุฮฤ", 11, 10, 1000);
		sa.getSalary(11);
//		System.out.println(sa);
		HourlyEmployee hou = new HourlyEmployee("บุฮฤ", 11, 10, 20, 170);
		hou.getSalary(10);
//		System.out.println(hou);
		SalerEmployee saler = new SalerEmployee("บุฮฤ", 11, 20, 6000, 0.5);
		saler.getSalary(11);
//		System.out.println(saler);
		BasedPlusSalesEmployee base = new BasedPlusSalesEmployee("haven", 6, 10, 6000, 0.5, 2000);
//		System.out.println(base);
		Employee []em={sa,hou,saler,base};
		for(Employee i:em)System.out.println(i);
	}
}
