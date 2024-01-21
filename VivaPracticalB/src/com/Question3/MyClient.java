package com.Question3;

	import java.rmi.Naming;

	public class MyClient {

	public static void main(String args[]){
	try{
	FactorialDemo stub = (FactorialDemo) Naming.lookup("rmi://localhost:5000/jbc");
	System.out.println("Calling server");
	System.out.println(stub.findFactorial(7));
	}catch(Exception e){
	System.err.println("Error: " + e.getMessage());
	}
	}

	}
