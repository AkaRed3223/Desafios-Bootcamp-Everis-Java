package DesafiosBootcampEverisJava;

//Neste teste, o input é de 4 valores inteiros que devem passar por checagens das seguintes condições:
//B é maior que C;
//D é maior que A;
//A soma de C e D é maior que a soma de A e B;
//C e D são positivos;
//A é par.
//Caso todas as condições sejam verdadeiras, imprima na tela "Valores aceitos".
//Caso alguma condição seja falsa, imprima na tela "Valores nao aceitos".

import java.util.Scanner;

public class Desafio3_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();

        if (b > c && d > a && c + d > a + b && c > 0 && d > 0 && a % 2 == 0) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
    }
}
