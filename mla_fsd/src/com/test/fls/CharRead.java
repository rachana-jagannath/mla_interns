package com.test.fls;
import java.io.BufferedReader;
import java.io.FileReader;
public class CharRead {
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new FileReader("src/ct.txt"));
		System.out.println(br.readLine());
	}
}
