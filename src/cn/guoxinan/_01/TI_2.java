package cn.guoxinan._01;

public class TI_2 {
	private String a="============================";
	private String b="=======";
	private TI_2() {
	}

	private static TI_2 ti_2;
	static {
		ti_2 = new TI_2();
	}
	/**
	 * 通过单例获得对象
	 * @return
	 */
	public static TI_2 getTI_2() {
		return ti_2;
	}
	/**
	 * 输出第一个图形 类似于三角形
	 * @author heave
	 * @since 2016年7月11日16:40:44
	 */
	public void ti_2() {
		System.out.println("我开始了哟");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
/**
 * 输出第二个图形 类似于矩形
 * @author heave
 * @since 2016年7月11日16:40:57
 */
	public void ti_3() {
		System.out.println("我开始了哟");
		for (int j = 0; j <= 3; j++) {
			for (int i = 0; i <= 4; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	/**
	 * 打印一个 首页页面
	 * @author heave
	 * @since 2016年7月11日16:52:24
	 * 
	 */
	public void ti_4(){
		System.out.println("我开始了哟");
		System.out.println(a);
		System.out.println("欢迎使用员工管理系统");
		System.out.println(a);
		System.out.println("      功能列表");
		System.out.println(b+"1.显示所有员工信息"+b);
		System.out.println(b+"2.添加员工信息"+b);
		System.out.println(b+"3.修改员工信息"+b);
		System.out.println(b+"4.查看员工信息"+b);
		System.out.println(b+"5.退出系统"+b);
		System.out.println(a);
	}
}
