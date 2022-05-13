package com.mindgate.main;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapMain {
public static void main(String[] args) {
	SortedMap<Integer,String> employeemap=new TreeMap<Integer,String>();
	employeemap.put(101, "pravin");
	employeemap.put(102, "aksh");
	employeemap.put(103, "puja");
	employeemap.put(104, "prakash");
	System.out.println(employeemap);
}
}
