package cn.itsource._05TemplateM;
/**
 * 
 * @author heave
 *ģ��ģʽ�ĳ�����
 */
public abstract class Account {
	
	/**
	 * ģ���еķ���
	 * ��Ϣ=����*����
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
