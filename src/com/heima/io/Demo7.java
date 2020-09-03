package com.heima.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Demo7 {

	public static void main(String[] args) throws IOException {
		File file=getFile();
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream(file));
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(file.getName()));
		int b;
		while((b=bis.read())!=-1) {
			bos.write(b);
		}
		bis.close();
		bos.close();

	}
public static File getFile() {
	Scanner in=new Scanner(System.in);
	System.out.println("请输入一个路径：");
	while(true) {
	String line=in.nextLine();
	File file=new File(line);
	if(!file.exists()) {
		System.out.println("路径不存在，请重新输入：");
	}else if(file.isDirectory()) {
		System.out.println("此路径是文件夹，请重新输入一个文件的路径：");
	}else {
		return file;
	}
	
	}
}
}
