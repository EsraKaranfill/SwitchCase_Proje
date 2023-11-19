package com.esra;

public class Runner_Ornek6 {
    public static void main(String[] args) {
        String gun = "Salı";

        String meyveTuru = switch (gun) {
            case "Pazartesi" -> "Hafta içi";
            case "Salı" -> "Hafta içi";
            case "Çarşamba" -> "Hafta içi";
            case "Perşembe" -> "Hafta içi";
            case "Cuma" -> "Hafta içi";
            case "Cumartesi" -> "Hafta sonu";
            case "Pazar" -> "Hafta sonu";
            default -> "Girilen gün hatalı";
        };
    }
}
