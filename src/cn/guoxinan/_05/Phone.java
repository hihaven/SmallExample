package cn.guoxinan._05;

import java.util.Arrays;

public class Phone {
	private String name;
	private Batter batter;
	private  String[] musiclist;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Batter getBatter() {
		return batter;
	}

	public void setBatter(Batter batter) {
		this.batter = batter;
	}

	public String[] getMusiclist() {
		return musiclist;
	}

	public void setMusiclist(String[] musiclist) {
		this.musiclist = musiclist;
	}

	public Phone() {
	}
public Phone(String name){
	this.batter = new Batter("一号电池", 30);
	this.musiclist =new String[] { "演员", "小幸运" };
	this.name=name;
}
	public Phone(String name, Batter batter, String[] musiclist) {
		super();
		this.name = name;
		this.batter = batter;
		this.musiclist = musiclist;
	}

	public void addMusic(String music) {
		String demp[] = new String[this.musiclist.length + 1];
		for(int i=0;i<demp.length-1;i++)demp[i]=this.musiclist[i];
		demp[demp.length-1]=music;
		this.musiclist=demp;
		this.batter.use();
		System.out.println("---------下载完毕");
	}

	public void getMusic(String music) {
		
		if (this.batter.getPower() >= 20) {
			boolean f=false;
			for (int i = 0; i < this.musiclist.length; i++) {
				if (this.musiclist[i] == music) {
					System.out.println("----------为你播放：" + music);
					System.out.println("---------lalalalalalala----");
					f=true;
				}
			}
			if(f==false)System.out.println("-----没有这首歌");
		} else {
			System.out.println("------电量已经不足，请充电");
		}
		
		
		this.batter.use();
	}

	public void addPower() {
		if (this.batter.getPower() == 100) {
			System.out.println("-----电量已经充满啦，");
		} else {
			this.batter.charge();
			System.out.println("--------充电一次，当前电量" + this.batter.getPower());
		}
	}

	@Override
	public String toString() {
		return "Phone [name=" + name + ", batter=" + batter + ", musiclist=" + Arrays.toString(musiclist) + "]";
	}

	

}
