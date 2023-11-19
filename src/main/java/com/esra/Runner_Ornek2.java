package com.esra;

import java.util.Scanner;

public class Runner_Ornek2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Kedi");
        System.out.println("Yılan");
        System.out.println("Japon balığı");
        System.out.println("Kurbağa");
        System.out.println("Yengeç");
        System.out.println("Lütfen yukarıdaki hayvanlardan birini seçiniz: ");
        String hayvan=scanner.nextLine().toLowerCase();

        switch (hayvan){
            case "kedi":
                System.out.println(hayvan+" bir memelidir.");
                break;
            case "yılan":
                System.out.println(hayvan+" bir sürüngendir.");
                break;
            case "japon balığı":
                System.out.println(hayvan+" bir balıktır.");
                break;
            case "kurbağa":
                System.out.println(hayvan+" bir amfibiyumdur");
                break;
            case "yengeç":
                System.out.println(hayvan+" bir omurgasızdır");
                break;
            default:
                System.out.println("Lütfen verilen seçeneklerden birini giriniz");
        }
    }
}
