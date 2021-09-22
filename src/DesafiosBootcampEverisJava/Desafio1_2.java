package DesafiosBootcampEverisJava;

//A ideia deste desafio é você criar um código que recebe dois números inteiros, e devolve a SOMA dos dois.

import java.util.Scanner;

public class Desafio1_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int A, B, SOMA;

        A = input.nextInt(); // digite aqui o valor de a
        B = input.nextInt(); // digite aqui o valor de b
        SOMA = A + B;

        System.out.println("SOMA = " + SOMA);
    }
}
