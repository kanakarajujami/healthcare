package com.nt.test;

import com.nt.service.AddOperation;

public class TestAddition {
public static void main(String[] args) {
	AddOperation add=new AddOperation();
	System.out.println("Add value 2 and 3 :"+add.add(2, 3));
System.out.println("Addition value 10 and 20:"+add.add(10, 20));;
}
}
