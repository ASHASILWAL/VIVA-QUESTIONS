package com.Question3;

	import java.rmi.Naming;

	public class MyServer {
	public static void main(String args[]){
	try{
	FactorialDemo stub = new FactorialEg();

	//we are binding the remote object by the name jbc

	Naming.rebind("rmi://localhost:5000/jbc", stub);
	System.out.println("Server Ready");
	}catch(Exception e){
	System.out.println(e);
	}
	}

	}

