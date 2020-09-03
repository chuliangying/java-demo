package com.heima.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo1_FileInputstream {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("aaa.txt");
		int x;
		while((x=fis.read())!=-1) {
			System.out.println(x);
		}
		fis.close();
	}

}
