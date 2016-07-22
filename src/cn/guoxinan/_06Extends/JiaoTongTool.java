package cn.guoxinan._06Extends;

public class JiaoTongTool {
	private String name;
	private String color;
	private String zuo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getZuo() {
		return zuo;
	}
	public void setZuo(String zuo) {
		this.zuo = zuo;
	}
	@Override
	public String toString() {
		return "JiaoTongTool [name=" + name + ", color=" + color + ", zuo=" + zuo + "]";
	}
	public JiaoTongTool(String name, String color, String zuo) {
		super();
		this.setColor(color);
		this.setName(name);
		this.setZuo(zuo);
	}
	public JiaoTongTool() {
		super();
	}
	
	
	
}
