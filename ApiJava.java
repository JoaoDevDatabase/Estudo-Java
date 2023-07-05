/*  Estudo Java com Git para podermos fazer o versionamento deste código
o intuito do Git neste código e mostrar minha evolução na linguagem Java
Linguagem que na qual estou estudando e me aprofundando muito!

*/

// Estrutura
// Início de Minha classe public

package src;

public class ApiJava {

    public static void main(String[] args) {

        // Definir as variáveis que eu passei para possuir o dado que nao pode mudar

        final String Nome = "João Vitor";
        final String Sobrenome = "Stellet Rodrigues Novais";

        // Definir a variável com nome significativo parecido com o nome do metodo
        String nomeCompleto = NomeCompleto(Nome, Sobrenome);

        System.out.println(nomeCompleto);

    }

    public static String NomeCompleto(String Nome, String Sobrenome) {
        return Nome.concat(" ").concat(Sobrenome);
    }

}