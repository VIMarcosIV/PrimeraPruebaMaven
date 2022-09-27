package org.iesch.ad;

import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        String prueba = "Tengo una muñeca vestida de azul";

        String resultado = StringUtils.substringAfter(prueba, "muñeca");
        String resultado2 = StringUtils.substringBefore(prueba, "muñeca");

        System.out.println(resultado);
        System.out.println(resultado2);

    }
}
