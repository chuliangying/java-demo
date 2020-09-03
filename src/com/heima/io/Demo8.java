package com.heima.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Demo8 {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		FileOutputStream fos=new FileOutputStream("aaa.txt");
		System.out.println("«Î ‰»Î ˝æ›£∫");
		while(true) {
			String line=sc.nextLine();
			if(!"quit".equals(line)) {
				fos.write(line.getBytes());
				fos.write("\r\n".getBytes());
			}else {
				break;
			}
		}
		fos.close();
	}

}
