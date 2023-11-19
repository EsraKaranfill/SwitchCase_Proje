package com.esra;

public class Runner_Ornek4 {
    public static void main(String[] args) {
        String meyve = "elma";

        String meyveTuru = switch (meyve) {
            case "elma", "armut", "kiraz" -> {
                yield "Çekirdekli meyve";
            }
            case "muz", "ananas" -> {
                yield "Tropikal meyve";
            }
            case "üzüm", "çilek" -> {
                yield "Çekirdeksiz meyve";
            }
            default -> {
                yield "Bilinmiyor";
            }
        };

        System.out.println(meyve + " meyvesi bir tür " + meyveTuru + "dir.");
    }
}
