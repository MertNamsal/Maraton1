package com.mertnamsal;

public class Soru3 {

	public static void main(String[] args) {
		
		System.out.println(karakterSayici("Bugün çok güzel bir gün",'g'));
		System.out.println(karakterSayici("Bugün güzel bir gün", 'x'));

	}
	public static int karakterSayici(String kelime, char harf) {
		
		int sayac=0;
		for (int i = 0; i < kelime.length(); i++) {
			if(kelime.charAt(i)==harf) {
				sayac++;
			}
		}
		return sayac;
	}

}
