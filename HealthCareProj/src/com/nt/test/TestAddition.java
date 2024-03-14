package com.nt.test;

import com.nt.service.AddOperation;

public class TestAddition {
public static void main(String[] args) {
	AddOperation add=new AddOperation();
	System.out.println("Add value :"+add.add(2, 3));
}
}
