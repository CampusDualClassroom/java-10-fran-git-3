package com.campusdual.classroom;

import java.util.concurrent.ThreadLocalRandom;

public class Exercise10 {

    public static void main(String[] args) {
        int blueCount = 0; // Contador de bolas azules

        // Bucle que sigue sacando bolas hasta que salgan dos azules
        while (blueCount < 2) {
            String ballColor = getBall();
            System.out.println(ballColor);
            if (ballColor.equals("azul")) {
                blueCount++;
            }
        }
    }


    public static String getBall() {

        int randomNumber = randomWithRange(1, 4); // Cambiar el máximo a 4 para incluir el 3
        String color = "";

        switch (randomNumber) {
            case 1:
                color = "rojo";
                break;
            case 2:
                color = "azul";
                break;
            case 3:
                color = "verde";
                break;
        }

        // Devolver el color seleccionado
        return color;
    }


    public static int randomWithRange(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max);
    }
}
