package com.mertnamsal;

import java.util.Scanner;

public class Soru4 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		menuGoster();

	}
	
	public static void menuGoster() {
		
		
		boolean kontrol = true;;
		while(kontrol) {
			System.out.println("*****************************");
			System.out.println("*   Geometrik Hesaplayıcı   *");
			System.out.println("*****************************");
			System.out.println("1-Kare alan hesaplama");
			System.out.println("2-Kare çevre hesaplama");
			System.out.println("3-Dikdörtgen alan hesaplama");
			System.out.println("4-Dikdörtgen çevre hesaplama");
			System.out.println("5-Daire alan hesaplama");
			System.out.println("6-Daire çevre hesaplama");
			System.out.println("7-Çıkış");
			int cevap = scan.nextInt();
			if(cevap>0 && cevap<8) {
				kontrol = false;
			}else {
				System.out.println("Yanlış tuşlama yaptınız.\n");
			}
			switch(cevap) {
				case 1:
					kareAlanHesapla();
					kontrol = true;
					break;
				case 2:
					kareCevreHesapla();
					kontrol = true;
					break;
				case 3:
					dikdortgenAlanHesapla();
					kontrol = true;
					break;
				case 4:
					dikdortgenCevreHesapla();
					kontrol = true;
					break;
				case 5:
					daireAlanHesapla();
					kontrol = true;
					break;
				case 6:
					daireCevreHesapla();
					kontrol = true;
					break;
				case 7:
					kontrol = false;
				}
			
		}
		
		
	}
	public static void kareAlanHesapla() {
		System.out.println("Karenin kenarının uzunluğu nedir ?");
		int kenar = scan.nextInt();
		System.out.println("Kenarı "+kenar+" olan karenin alanı : "+kenar*kenar+"\n");
	}
	
	public static void kareCevreHesapla() {
		System.out.println("Karenin kenarının uzunluğu nedir ?");
		int kenar = scan.nextInt();
		System.out.println("Kenarı "+kenar+" olan karenin alanı : "+kenar*4+"\n");
	}
	
	public static void dikdortgenAlanHesapla() {
		System.out.println("Dikdörtgenin uzun kenarının uzunluğu nedir ?");
		int uzunKenar = scan.nextInt();
		
		System.out.println("Dikdörtgenin kısa kenarının uzunluğu nedir ?");
		int kisaKenar = scan.nextInt();
		
		System.out.println("Uzun kenarı "+uzunKenar+" Kısa kenarı :"+kisaKenar+" olan dikdörtgenin alanı : "+kisaKenar*uzunKenar+"\n");
	}
	
	public static void dikdortgenCevreHesapla() {
		System.out.println("Dikdörtgenin uzun kenarının uzunluğu nedir ?");
		int uzunKenar = scan.nextInt();
		
		System.out.println("Dikdörtgenin kısa kenarının uzunluğu nedir ?");
		int kisaKenar = scan.nextInt();
		
		System.out.println("Uzun kenarı "+uzunKenar+" Kısa kenarı :"+kisaKenar+" olan dikdörtgenin çevresi : "+(uzunKenar+kisaKenar)*2+"\n");
	}
	
	public static void daireAlanHesapla() {
		System.out.println("Dairenin çap uzunluğu nedir ?");
		int cap = scan.nextInt();
		System.out.println("Çapı : "+cap+" olan dairenin alanı : "+Math.PI*Math.pow(cap, 2)+"\n");
	}
	
	public static void daireCevreHesapla() {
		System.out.println("Dairenin çap uzunluğu nedir ?");
		int cap = scan.nextInt();
		System.out.println("Çapı : "+cap+" olan dairenin çevresi : "+2*Math.PI*cap+"\n");
	}

}
