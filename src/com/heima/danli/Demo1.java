package com.heima.danli;

import java.io.IOException;

public class Demo1 {

	public static void main(String[] args) throws IOException {
		Runtime r=Runtime.getRuntime();
		//r.exec("shutdown -s -t 300");
		r.exec("shutdown -a");
	}

}
