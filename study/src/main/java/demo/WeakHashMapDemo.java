package demo;

import java.util.IdentityHashMap;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.Map.Entry;

public class WeakHashMapDemo {

	public static void main(String[] args) {
		WeakHashMap<String,Integer> hash=new WeakHashMap<String,Integer>();

		hash.put(new String("姓名"),18);
		hash.put(new String("姓名2"),20);
		
		Set<Entry<String,Integer>> entrys=hash.entrySet();
		for(Entry<String,Integer> entry:entrys) {
			System.out.println(entry);			}
		System.out.println(hash.size());
		
		System.gc();
		System.out.println(hash.size());

		for(Entry<String,Integer> entry:entrys) {
			System.out.println(entry);			}

	}

}
