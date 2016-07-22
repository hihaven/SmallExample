package cn.itsource._05TemplateM;
/**
 * 
 * @author heave
 *模板模式的抽象类
 */
public abstract class Account {
	
	/**
	 * 模板中的方法
	 * 利息=本金*利率
	 */
	public  double jisuanlixi(){
		double a=doa();
		String b=dob();
		double c=doc(b);
		return a*c;
	}
	protected double  doa(){
		return 1000;
	}
	protected abstract String dob();
	protected abstract double doc(String b);
}
