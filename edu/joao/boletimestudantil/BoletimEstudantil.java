// arquivo BoletimEstudantil.java
// Um estudo para poder aprender else/if em java!

package src.edu.joao.boletimestudantil;

import java.util.Scanner;

public class BoletimEstudantil {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int Number;

        System.out.print("Insira um número: ");
        Number = input.nextInt();

        if (Number < 6) {
            System.out.println("REPROVADO");
        } else if (Number == 6) {
            System.out.println("PASSOU RASPANDO");
        } else {
            System.out.println("PARABENS VOCE FOI APROVADO!");
        }

    }
}
// PROGRAMA FEITO COM SUCESSO !
