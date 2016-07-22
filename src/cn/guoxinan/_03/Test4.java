package cn.guoxinan._03;
import java.util.Hashtable;
public class Test4 {

	public static void main(String[] args) {
		Hashtable<Integer,Integer> ht= new Hashtable<Integer,Integer>();
		for(int i=0;i<10;i++){
			ht.put(i, i*i);
		}
		System.out.println(ht.size());
		System.out.println(ht.containsKey(0));
		System.out.println(ht.contains(4));
		System.out.println(ht.put(1, 0)+""+ht.get(1));
		ht.clear();
		System.out.println(ht.size());
	}

}