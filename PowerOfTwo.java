package com.basicprograms;

public class PowerOfTwo {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int result = 1;
		
		//System.out.println(args[0]);
		
     	for (int i = 1; i <= num; i++) {
             result *= 2;
		System.out.println("2^"+i+"="+result);
		}
	}
}

