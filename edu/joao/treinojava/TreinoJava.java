// Projeto que vai me dar a entrada do meu usúario que ele vai colocar seu nome,
// Entrada do usuário com nome, idade, e aonde mora
// no final nos vamos dar o resultado completo desta entrada do usuário

package src.edu.joao.treinojava;

import java.util.Scanner;

public class TreinoJava {

    public static void main(String[] args) {

        // Vamos colocar a nossa ferramenta para nos retornar a entrada;
        Scanner input = new Scanner(System.in);

        // Vamos passar as variáveis que vai ter em meu programa
        String PrimeiroNome;
        String SegundoNome;

        // Vamos colocar agora a idade que o meu usuário vai colocar;
        int idade;

        // Vamos colocar o cep em que meu usuário esta morando;
        // (CASO FOR UM PROGRAMA DE RASTREIO DO CORREIOS OU ALGO DESSE TIPO);
        String Logradouro;

        // Agora nos vamos colocar os inputs de nosso programa.

        System.out.println("Coloque o seu primeiro nome: ");
        PrimeiroNome = input.nextLine();

        System.out.println("  Otimo! Agora coloque o seu segundo nome :");
        SegundoNome = input.nextLine();

        System.out.printf("  Maravilha! então seu nome e : %s %s, ", PrimeiroNome, SegundoNome);

        System.out.println("Digite seu cep: ");
        Logradouro = input.nextLine();

        System.out.println("  Quantos anos voce tem : ");
        idade = input.nextInt();
        if (idade < 18) {
            System.out.println("Não podemos concluir o seu cadastro!");
        } else if (idade >= 18) {
            System.out.println("Cadastro Feito com sucesso!");
        }
    }

}