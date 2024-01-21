package com.Question3;

	import java.rmi.RemoteException;
	import java.rmi.server.UnicastRemoteObject;

	public class FactorialEg extends UnicastRemoteObject implements FactorialDemo {

	protected FactorialEg() throws RemoteException {
	super();
	// TODO Auto-generated constructor stub
	}
	public long findFactorial(int number) {
	long factorial = 1;
	for (int i = 1; i <= number; i++) {
	     factorial *= i;
	}
	return factorial;
	}


	}

