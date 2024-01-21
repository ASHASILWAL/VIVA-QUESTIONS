package com.rmi;

	import java.rmi.Remote;
	import java.rmi.RemoteException;

	public interface ProductDemo extends Remote {

	public int multiply(int x,int y)throws RemoteException;

	}



	


	

	

