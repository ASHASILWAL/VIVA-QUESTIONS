package com.Question3;

	import java.rmi.Remote;
	import java.rmi.RemoteException;

	public interface FactorialDemo extends Remote{
	public long findFactorial(int x ) throws RemoteException;


	}

