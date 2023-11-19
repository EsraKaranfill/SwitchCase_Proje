package com.esra;

public class Runner_Ornek5 {
    public static void main(String[] args) {
        String meyve = "elma";

        String meyveTuru = switch (meyve) {
            case "elma", "armut", "kiraz" -> "Çekirdekli meyve";
            case "muz", "ananas" -> "Tropikal meyve";
            case "üzüm", "çilek" -> "Çekirdeksiz meyve";
            default -> "Bilinmiyor veya tanımlanmamış";
        };

        System.out.println(meyve + " meyvesi bir tür " + meyveTuru + "dir.");

    }
}
