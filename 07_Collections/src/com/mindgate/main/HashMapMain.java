package com.mindgate.main;

import java.util.HashMap;
import java.util.Map;

public class HashMapMain {
public static void main(String[] args) {
	Map<Integer,String> employeemap=new HashMap<Integer,String>();
	employeemap.put(101,"santosh");
	employeemap.put(102,"vaibhav");
	employeemap.put(103,"raj");
	employeemap.put(104,"rashi");
	employeemap.put(101,"rakesh");
	System.out.println(employeemap);
	
}
}
