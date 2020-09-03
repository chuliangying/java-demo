package com.heima.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo5 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("aaa.txt");
		FileOutputStream fos=new FileOutputStream("bbb.txt");
		byte[] arr=new byte[3];
		int b;
		while((b=fis.read(arr))!=-1) {
			fos.write(arr, 0, b);
		}
		fis.close();
		fos.close();

	}

}
