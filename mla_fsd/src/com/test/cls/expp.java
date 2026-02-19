package com.test.cls;
import java.util.TreeMap;
public class expp {
	public static void main(String[] args) {
		//HashMap<String, Integer> data = new HashMap<>();
		//LinkedHashMap<String, Integer> data=new LinkedHashMap<>();
		TreeMap<String, Integer> data=new TreeMap<>();
		data.put("sony", 330);
		data.put("lenovo", 320);
		data.put("dell",200);
		data.put("sony", 5050);
		data.put("aple", 350);
		data.put("dell", 400);
		data.put("asus", 11);    
		data.put("Zen", 100);
		data.forEach((k,v) -> System.out.println(k+" : "+v));
		System.out.println(data.get("sony"));
		}
}
