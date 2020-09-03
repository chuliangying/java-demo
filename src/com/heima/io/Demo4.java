package com.heima.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo4 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("9¼þÌ×4.jpg");
		FileOutputStream fos=new FileOutputStream("wo.jpg");
		byte[] arr=new byte[fis.available()];
		fis.read(arr);
		fos.write(arr);
		fis.close();
		fos.close();

	}

}
