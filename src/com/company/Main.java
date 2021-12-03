package com.company;

import java.util.Scanner;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner oku= new Scanner(in);
        out.println("Bir Sayi Giriniz:");

        int sayi=oku.nextInt();
        int faktoriyel=1;
        int i;
        for(i=1;i<sayi;i++){

            faktoriyel+=faktoriyel*i;
        }
        out.println("Sonuc:"+faktoriyel);
    }
}
