package src;

import java.util.Scanner;

public class TreinoJava {

    public static void main(String[] args) {

        // Vamos colocar um input da janela de comando a partir do Scanner;

        Scanner input = new Scanner(System.in);

        // Vou passar para as variáveis que vou usar mais a frente para calcularmos;

        int number1;
        int number2;
        int sum; // soma

        // vamos fazer a entrada do usuário colocando o número;

        System.out.print("Tap a anything number for sum  : ");// entrada do meu usuário para poder somar;
        number1 = input.nextInt(); // aqui o código ele vai entender que e para ele poder somar;

        // Vamos fazer a outra entrada do usuário para poder somar com o outro número;

        System.out.print("Tap another number for sum with last number : ");
        number2 = input.nextInt();

        // Agora vamos fazer a soma destes dois números colocados pelo usuário;

        sum = number1 + number2;
        System.out.printf("That's is you results %d%n", sum);

    }
}// Fim do meu método
