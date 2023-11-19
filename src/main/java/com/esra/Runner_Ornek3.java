package com.esra;

public class Runner_Ornek3 {
    public static void main(String[] args) {

        EGunler gunler=EGunler.PAZARTESI;

        switch (gunler){
            case PAZARTESI:
                System.out.println("Hafta içi");
                break;
            case SALI:
                System.out.println("Hafta içi");
                break;
            case CARSAMBA:
                System.out.println("Hafta içi");
                break;
            case PERSEMBE:
                System.out.println("Hafta içi");
                break;
            case CUMA:
                System.out.println("Hafta içi");
                break;
            case CUMARTESI:
                System.out.println("Hafta sonu");
                break;
            case PAZAR:
                System.out.println("Hafta sonu");
                break;
        }
    }

}
