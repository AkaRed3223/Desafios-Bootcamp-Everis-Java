package DesafiosBootcampEverisJava;

//Este desafio quer testar se você sabe utilizar corretamente um loop de repetição "for";
//Preste atenção:

//A primeira variável a ser recebida é N:
//N representa a QUANTIDADE DE PARES DE INTEIROS A SEREM INPUTADAS (X e Y)
//Ou seja, se temos N = 3, teremos 3 pares de X e Y. Logo, 3 repetições.

//Ao informarmos o valor de N, o sistema está pronto pra receber o primeiro par
//Então, ele verifica se o Y é igual a zero. Caso isso seja verdade, responde "divisao impossivel", pois
//não é possível dividir por zero... você sabia disso... Né??? NÉ??? kkk
//Caso a divisão seja possível, o sistema retorna o valor da divisão, formatado apenas com uma casa decimal

import java.util.Scanner;

public class Desafio1_3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt(); // recebe N (a quantidade de pares de inteiros)
        int X, Y;

        for (int i = 0; i < N; i++) { // inicia-se o loop do tamanho de N
            X = input.nextInt(); // recebe o valor de X
            Y = input.nextInt(); // recebe o valor de Y

            if (Y == 0) { // se Y é igual a zero, a divisão é impossível
                System.out.println("divisao impossivel");
            } else { // se a divisão é possível, retorna o valor da divisão, formatado com apenas uma casa decimal
                System.out.println((String.format("%.1f", (float) X / Y)));
            }
        }
    }
}
