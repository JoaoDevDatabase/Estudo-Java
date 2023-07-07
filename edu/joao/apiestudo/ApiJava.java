package src.edu.joao.apiestudo;

public class ApiJava {
    public static void main(String[] args) {

        // Variáveis relacionadas a minha classe e NomeCompleto
        final String primeiroNome = "João Vitor";
        final String SegundoNome = "Stellet Rodrigues Novais";

        // Varáveis relacionadas a minha classe de mensagem de apoio
        final String PrimeiraMensagem = "Tudo irá dar certo!! ";
        final String SegundaMensagem = " Isso Tudo e Fruto do seu esforço, ";
        final String TerceiraMensagem = "Vá em frente que você chegará lá!";

        // VAMOS AJEITAR AS VARIÁVEIS E ALINHAR COM OS MÉTODOS =
        String nomeCompleto = NomeCompleto(primeiroNome, SegundoNome);
        String mensagemApoio = MensagemApoio(PrimeiraMensagem, SegundaMensagem, TerceiraMensagem);

        // VAMOS COLOCAR O OUTPUT DESTA MINHA APLICAÇÃO
        System.out.println(nomeCompleto);
        System.out.println(mensagemApoio);

    }

    // CLASSE DE NOMECOMPLETO
    public static String NomeCompleto(String primeiroNome, String SegundoNome) {
        return primeiroNome.concat(" ").concat(SegundoNome);
    }

    // CLASSE MENSAGEM DE APOIO
    public static String MensagemApoio(String PrimeiraMensagem, String SegundaMensagem, String TerceiraMensagem) {

        return PrimeiraMensagem.concat(" ").concat(SegundaMensagem).concat(TerceiraMensagem);

    }
}