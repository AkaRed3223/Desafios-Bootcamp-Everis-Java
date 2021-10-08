package DesafiosBootcampEverisJava;

//Este desafio aqui me deu um trabalhão...
//A ideia dele desafio é testar seu conhecimento sobre as estruturas for e loop.
//Inicialmente determinamos o scanner e as variaveis nota1 e nota2 que deverão receber as notas.
//Inicia-se uma estrutura "for" que deverá validar a nota. Caso passe no crivo, ele checa se a variável nota1 está vazia;
//Caso não passe, imprime "nota invalida" e retoma o loop sem incrementar "i";
//Ao achar uma nota válida, checa se a variável nota1 está vazia, se estiver vazia,
//atribui a nota para nota1, incrementa, e repete o loop.
//então entra a próxima nota, caso passe no crivo, nota1 agora não está mais vazia, então a atribui para nota2.
//Ao final de tudo, é criada a variável media, que soma as duas notas e divide por 2.
//Então imprime formatada 2 casas decimais.

import java.util.Scanner;

public class Desafio3_3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nota1 = 0;
        double nota2 = 0;

        for (int i = 0; i < 2;) {
            double validador = input.nextDouble();
            if (validador > 0 && validador <= 10) {
                if (nota1 == 0) {
                    nota1 = validador;
                } else
                    nota2 = validador;
                i++;
            } else {
                System.out.println("nota invalida");
            }
        }

        double media = (nota1 + nota2) / 2;
        System.out.print("media = " + (String.format("%.2f", media)));

    }
}

//Saiba que você não está sozinho. Estou passando pelas mesmas dificuldades que você.
//Sozinhos não conseguimos nada. Vamos chegar lá juntos!
//me manda uma mensagem lá linkedin.com/in/cesar-g-sales caso eu tenha te ajudado. Espero que sim!
//Um abraço. Be strong!