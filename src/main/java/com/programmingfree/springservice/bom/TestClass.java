package com.programmingfree.springservice.bom;

public class TestClass {

	
	private String stringVal;
	private int intVal;
	private float floatVal;
	public String getStringVal() {
		return stringVal;
	}
	public void setStringVal(String stringVal) {
		this.stringVal = stringVal;
	}
	public int getIntVal() {
		return intVal;
	}
	public void setIntVal(int intVal) {
		this.intVal = intVal;
	}
	public float getFloatVal() {
		return floatVal;
	}
	public void setFloatVal(float floatVal) {
		this.floatVal = floatVal;
	}
	@Override
	public String toString() {
		return "TestClass [stringVal=" + stringVal + ", intVal=" + intVal
				+ ", floatVal=" + floatVal + "]";
	}
	
	
	
	
}
