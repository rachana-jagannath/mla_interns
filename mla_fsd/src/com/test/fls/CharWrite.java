package com.test.fls;
import java.io.BufferedWriter;
import java.io.FileWriter;
public class CharWrite {
	public static void main(String[] args) throws Exception{
	FileWriter fw=new FileWriter("src/ct.txt");
	BufferedWriter bw=new BufferedWriter(fw);
	String msg="This is simple char stream write and read operation";
	bw.write(msg);
	bw.flush();
	System.out.println("Done. ");
}
}