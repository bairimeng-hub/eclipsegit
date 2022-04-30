package demo;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.Map.Entry;

public class IdentityHashMapDemo {

	public static void main(String[] args) {
			IdentityHashMap<String,Integer> hash=new IdentityHashMap<String,Integer>();
			String str1=new String("姓名");
			String str2=new String("姓名");
			hash.put(str1,18);
			hash.put(str2, 20);
			
			Set<Entry<String,Integer>> entrys=hash.entrySet();
			for(Entry<String,Integer> entry:entrys) {
				System.out.println(entry);			}
			System.out.println(hash.size());
		
		}


	}

