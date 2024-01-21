package com.test;

	import java.io.IOException;
	import java.net.URL;
	import java.net.URLConnection;

	public class QuestionThree {
	    public static void main(String[] args) {
	        String s = "https://www.example.com";
	        try {
	            URL u = new URL(s);
	            URLConnection conn = u.openConnection();
	            int contentLength = conn.getContentLength();

	            if (contentLength != -1) {
	                
	            for(int j =1; ; j++)
	    {
	    String header = conn.getHeaderField(j);
	    if(header == null) break;
	    System.out.println(conn.getHeaderFieldKey(j)+":"+header);
	    }
	    
	            } else {
	                System.out.println("Content Length is not available in the HTTP headers.");
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}
