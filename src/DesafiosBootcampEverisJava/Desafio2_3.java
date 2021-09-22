package DesafiosBootcampEverisJava;

//Neste desafio, o input é um inteiro que representa os segundos
//O programa imprime na tela a hora completa convertida

import java.util.Scanner;

public class Desafio2_3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sec;
        sec = input.nextInt(); //digite aqui a quantidade de segundos

        int hour = sec / 3600;
        sec = sec - (hour * 3600);

        int min = sec / 60;
        sec = sec - (min * 60);

        System.out.println(hour + ":" + min + ":" + sec);

    }
}
