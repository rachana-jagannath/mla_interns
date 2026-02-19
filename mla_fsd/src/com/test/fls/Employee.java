package com.test.fls;
import java.io.Serializable;
public class 
public class Employee {
	private static final long serialVersionUID=1L;
	private int id=101;
	private String name="Rohit";
	private String cmp="Mphasis";
	private transient int pin=560048;
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", cmp=" + cmp + "]";
	}
}
