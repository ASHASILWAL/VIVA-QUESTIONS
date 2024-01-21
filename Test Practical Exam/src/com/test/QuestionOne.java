package com.test;

	import java.net.*;
	import java.util.Enumeration;

	public class QuestionOne {
	public static void main(String[] args) throws SocketException{
	try {
	           Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();

	           while (networkInterfaces.hasMoreElements()) {
	               NetworkInterface n = networkInterfaces.nextElement();

	               System.out.println("Name of Interface : " + n.getName());
	               System.out.println("Name: " + n.getDisplayName());
	               System.out.println("Is Up: " + n.isUp());
	               System.out.println("Is Loopback: " + n.isLoopback());
	               System.out.println("Virtual: " + n.isVirtual());
	               System.out.println("Point to Point: " + n.isPointToPoint());
	               System.out.println("Supports Multicast: " + n.supportsMulticast());
	             
	               System.out.println();
	           }
	       } catch (SocketException e) {
	           e.printStackTrace();
	       }
	   }

	}
