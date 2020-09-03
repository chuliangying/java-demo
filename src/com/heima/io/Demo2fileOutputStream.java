package com.heima.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2fileOutputStream {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("bbb.txt");
		fos.write(20);
		fos.write(10);
		fos.write(30);
		fos.write(97);
		fos.close();

	}

}
