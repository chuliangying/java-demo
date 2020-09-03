package com.heima.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo6 {

	public static void main(String[] args) throws IOException {
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream("Œ“.jpg"));
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("h.jpg"));
		int a;
		while((a=bis.read())!=-1) {
			bos.write(a^456);
		}
		bis.close();
		bos.close();
	BufferedInputStream bis1=new BufferedInputStream(new FileInputStream("h.jpg"));
	BufferedOutputStream bos1=new BufferedOutputStream(new FileOutputStream("j.jpg"));
	int b;
	while((b=bis1.read())!=-1) {
		bos1.write(b^456);
	}
	bis.close();
	bos.close();
	}
}
