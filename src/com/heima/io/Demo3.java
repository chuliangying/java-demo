package com.heima.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo3 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("9¼þÌ×4.jpg");
		FileOutputStream fos=new FileOutputStream("ÎÒ.jpg");
		int b;
		while((b=fis.read())!=-1) {
			fos.write(b);
		}
		fis.close();
		fos.close();

	}

}
