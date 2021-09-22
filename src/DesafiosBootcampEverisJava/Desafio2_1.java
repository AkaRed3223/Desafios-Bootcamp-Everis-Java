package DesafiosBootcampEverisJava;

//Neste desafio, o input é um tweet, cujo tamanho não pode exceder 140 caracteres.
//A ideia é receber um tweet e dizer se ele deve ser tuitado ou mutado

import java.util.Scanner;

public class Desafio2_1 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String T = leitor.nextLine(); //digite aqui o tweet desejado

        if (T.length() <= 140) {
            System.out.println("TWEET");
        } else {
            System.out.println("MUTE");
        }

    }

}
