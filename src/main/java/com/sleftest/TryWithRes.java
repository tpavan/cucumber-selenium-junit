package com.sleftest;


public class TryWithRes {
		
	static String s1 = "Tester";
	static String s2 = new String("Tester");
	
	

	public static void main(String[] args) {
		if(s1 == s2){
			System.out.println("Both are equals");
		}else{
			System.out.println("Not equals");
		}
	}
	

}
