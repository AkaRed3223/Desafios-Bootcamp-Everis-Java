package DesafiosBootcampEverisJava;

//No primeiro desafio, o input é um número inteiro que representa uma quantidade de minutos.
//A saída deve imprimir essa quantidade vezes 2.

import java.util.Scanner;

public class Desafio1_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int minutos;
        minutos = input.nextInt(); // digite aqui os minutos

        System.out.println(2 * minutos + " minutos");
    }
}
