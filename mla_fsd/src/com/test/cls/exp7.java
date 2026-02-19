package com.test.cls;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
public class exp7 {
	public static void main(String[] args) {
		ArrayList data=new ArrayList();
		data.add(200);
		data.add('a');
		data.add(33);
		data.add(200);
		data.add("java");
		data.add("test");
		data.add(33.33f);
		data.add(false);
		data.add("java");
		data.add(345l);
		System.out.println(data);
		data.set(7, true);
		System.out.println(data.size());
		ListIterator ltr=data.listIterator();
		while(ltr.hasNext()) {
			System.out.println(ltr.next());
		}
		System.out.println("==========");
		while(ltr.hasPrevious()) {
			System.out.println(ltr.previous());
		}
	}
}
