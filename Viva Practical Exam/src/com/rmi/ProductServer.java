package com.rmi;

	import java.rmi.Naming;
	
	public class ProductServer {
		
	public static void main(String args[]){
	try {
	ProductDemo stub = new ProductEg();
	//we are binding the remote object by the name jbc
	Naming.rebind("rmi://localhost:5000/jbc",stub);
	System.out.println("Server ready:");

	} catch (Exception e) {
	// TODO: handle exception
	System.out.println(e);
	}
	}
	}
