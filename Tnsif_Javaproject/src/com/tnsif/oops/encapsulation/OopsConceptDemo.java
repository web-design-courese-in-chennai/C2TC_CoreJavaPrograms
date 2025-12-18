package com.tnsif.oops.encapsulation;

public class OopsConceptDemo {
	//DataMembers
 private int serialNum;// private can only be accepted inside this class alone
 private String name;
 private int age;
 // Getters and Setters method
	public int getSerialNum() { // get the value
	return serialNum;
}

 public void setSerialNum(int serialNum) { // set to the correct positionn
	this.serialNum = serialNum;
 }

 public String getName() {
	return name;
 }

 public void setName(String name) {
	this.name = name;
 }

 public int getAge() {
	return age;
 }

 public void setAge(int age) {
	this.age = age;
 }
@Override
public String toString() {
	return"OopsConceptDemo [Serial Number="+serialNum + ",  Name = " +name+ ",  Age= " +age+"]";
}
	
}
