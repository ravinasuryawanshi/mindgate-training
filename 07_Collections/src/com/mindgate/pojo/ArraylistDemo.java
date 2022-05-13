package com.mindgate.pojo;

import java.util.List;

public class ArraylistDemo {
	private int arraylistid;
	private List<String> nameList;
	 public ArraylistDemo() {
		// TODO Auto-generated constructor stub
	}
	public ArraylistDemo(int arraylistid, List<String> nameList) {
		super();
		this.arraylistid = arraylistid;
		this.nameList = nameList;
	}
	public int getArraylistid() {
		return arraylistid;
	}
	public void setArraylistid(int arraylistid) {
		this.arraylistid = arraylistid;
	}
	public List<String> getNameList() {
		return nameList;
	}
	public void setNameList(List<String> nameList) {
		this.nameList = nameList;
	}
	@Override
	public String toString() {
		return "ArraylistDemo [arraylistid=" + arraylistid + ", nameList=" + nameList + "]";
	}
	

	
	 
}
