package com.weimob.wangcb.base;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.FileAlreadyExistsException;

public class TestObjSerializeAndDeserialize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			SerializePersion();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void SerializePersion() throws IOException, FileNotFoundException{
		Person person = new Person();
		person.setName("wang");
		person.setAge(26);
		
		
		ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(new File("E:/person.txt")));
		oo.writeObject(person);
		System.out.println("序列化 完成");
		oo.close();
	}

}
