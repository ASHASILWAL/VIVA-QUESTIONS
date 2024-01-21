package com.rmi;

	import java.rmi.Naming;

	public class ProductClient {
		
	public static void main(String[] args){
	try {
	ProductDemo stub =(ProductDemo) Naming.lookup("rmi://localhost:5000/jbc");
	System.out.println("Calling Server:");
	System.out.println(stub.multiply(10, 30));

	} catch (Exception e) {
	// TODO: handle exception
	System.err.println("Error "+e.getMessage());
	}
	}

	}
