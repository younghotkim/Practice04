package com.javaex.practice;

public class Ex04 {

	public static void main(String[] args) {

		int[] data = { 1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31};
		
		int t = 0;
		int sum = 0;
		
		
		for (int i=0; i<data.length; i++) {
			
			if (data[i]%3==0) { 
				
				t++;
				sum=sum+data[i];
			}
		}
		
		System.out.println("주어진 배열에서 3의 배수의 개수==>" + t);
		System.out.println("주어진 배열에서 3의 배수의 합==>" + sum);
		
		
		
		
		

	}

}
