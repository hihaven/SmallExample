package cn.itsource._05TemplateM;
/**
 * 
 * @author heave
 *模板模式，
 *@1抽象类中实现一个方法中调用其它方法，这些方法有不同实现
 */
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account=new LinvA();
		System.out.println("-----"+account.jisuanlixi());
		account=new LinvB();
		System.out.println("------"+account.jisuanlixi());
	}

}
