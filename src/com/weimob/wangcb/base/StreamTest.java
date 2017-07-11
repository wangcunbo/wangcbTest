package com.weimob.wangcb.base;
import java.io.*;

public class StreamTest {
	public static void main(String[] args){
		for(EnumTest en:EnumTest.values()){
			System.out.println(en);
		}
		
		
	}

	public enum EnumTest{
		one, two, thr, fou, fir, six, seven; 
	}
}

