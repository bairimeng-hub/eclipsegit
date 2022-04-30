package demo;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		WeakHashMap<String,Integer> hash=new WeakHashMap<String,Integer>();
		String str1=new String("姓名");
		String str2=new String("姓名");
		hash.put(str2,18);
		hash.put(str2, 20);
		
		Set<Entry<String,Integer>> entrys=hash.entrySet();
		for(Entry<String,Integer> entry:entrys) {
			System.out.println(entry);
		}
	

	}

}
