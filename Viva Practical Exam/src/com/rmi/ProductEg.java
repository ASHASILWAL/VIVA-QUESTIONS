package com.rmi;

	import java.rmi.*;
	import java.rmi.server.UnicastRemoteObject;

	public class ProductEg extends UnicastRemoteObject implements ProductDemo {

	public  ProductEg() throws RemoteException {
	super();
	// TODO Auto-generated constructor stub
	}

	public int multiply(int x, int y)  {
	// TODO Auto-generated method stub
	return x*y;
	}

	}

