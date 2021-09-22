package DesafiosBootcampEverisJava;

//Neste desafio, o input é o DDD de algum estado.
//Caso o estado esteja na tabela, deve ser impresso na tela seu nome.
//Caso não esteja, deve mostrar "DDD não cadastrado"

import java.util.Scanner;

public class Desafio2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a;
        a = input.nextInt(); //digite aqui o DDD desejado

        switch (a) {
            case 61:
                System.out.println("Brasilia");
                break;
            case 71:
                System.out.println("Salvador");
                break;
            case 11:
                System.out.println("Sao Paulo");
                break;
            case 21:
                System.out.println("Rio de Janeiro");
                break;
            case 32:
                System.out.println("Juiz de Fora");
                break;
            case 19:
                System.out.println("Campinas");
                break;
            case 27:
                System.out.println("Vitoria");
                break;
            case 31:
                System.out.println("Belo Horizonte");
                break;
            default:
                System.out.println("DDD nao cadastrado");
                break;
        }
    }
}
