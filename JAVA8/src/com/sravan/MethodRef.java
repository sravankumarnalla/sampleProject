package com.sravan;

@FunctionalInterface 
interface MyInterface{  
    void display();  
    
}  
public class MethodRef {  
    public void myMethod(){  
	System.out.println("Instance Method");  
    }  
    public static void main(String[] args) {  
    	MethodRef obj = new MethodRef();   
	// Method reference using the object of the class
	MyInterface ref = obj::myMethod;  
	// Calling the method of functional interface  
	ref.display();  
    }  
}