package com.mertnamsal;

public class Soru1 {

	public static void main(String[] args) {
		sekil();

	}
	public static void sekil() {
		for(int i =0;i<3;i++) {
			for(int j =0;j<7;j++) {
				System.out.print("*");
				if(j!=6) {
					System.out.print(" ");
				}
			}System.out.println();
		}
		for(int i = 0;i<7;i++) {
			for(int j=7;j>i;j--) {
				System.out.print("*");
				if(j!=i+1) {
					System.out.print(" ");
				}	
			}
			System.out.println();
			
		}
	}
}
