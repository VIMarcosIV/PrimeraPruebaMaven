package org.iesch.ad.junitbasico;

public class Main {
    public static void main(String[] args) {
// Mostrar un salario de que tenemos 1000 dolares -> $1000

        double salary = 1000;

        System.out.println(MoneyUtil.format(salary));
    }
}
