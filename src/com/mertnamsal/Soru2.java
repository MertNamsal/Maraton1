package com.mertnamsal;

import java.util.Scanner;

public class Soru2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Dizinin boyutu nedir ?");             //Dizi boyutu alma
		int[] sayiDizisi = new int[scan.nextInt()];
		
		for(int i = 0 ;i<sayiDizisi.length;i++) {                 //Diziyi oluşturma
			System.out.println(i+1 + ". sayıyı giriniz :");
			sayiDizisi[i]=scan.nextInt();
		}
		
		tekrarEdeniYazdir(sayiDizisi);
	}
	public static void tekrarEdeniYazdir(int[] sayiDizisi) {
		
		int sayac = 1;                                            //Kaç kere tekrar ettiğini bulmak için sayaç
		int tekrarEdenSayi=0;
		int tekrarEdenSayi0=1;
		for (int i = 0; i < sayiDizisi.length; i++) {
			for (int j = 0; j < sayiDizisi.length; j++) {
				if(sayiDizisi[i]==sayiDizisi[j] && j!=i) {         //Bir sayiyi diğer sayilarla kontrol ediyor
					sayac++;										//tekrar ediyorsa ++
					if(sayiDizisi[i]!=0) {
						tekrarEdenSayi = sayiDizisi[i];            //hangi sayının tekrar ettiği
					}else {
						tekrarEdenSayi0 = sayiDizisi[i];
					}
					                 
				}
			}if(tekrarEdenSayi !=0 || tekrarEdenSayi0 !=1) {
				break;
			}
		}
		if(sayac == 1) {
			System.out.println("Tekrar eden sayı bulunamamıştır.");
		}else if(tekrarEdenSayi0 !=1) {
			System.out.println(tekrarEdenSayi0+" sayisi "+sayac+" kez tekrar ediyor.");
		}else {
			System.out.println(tekrarEdenSayi+" sayisi "+sayac+" kez tekrar ediyor.");
		}
	}

}

