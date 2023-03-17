package br.com.suportempt.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Gerador {

    /**
     * qtd é a quantidade de números que serão gerados.
     *
     * @param qtd
     * @return exemplo qtd = 3 -> "323"
     */
    public static String gerarNumero(int qtd) {
        String numero = "";
        for (int i = 0; i < qtd; i++) {
            numero += (int) (Math.random() * 10);
        }
        return numero;
    }

    // (48)93456-5899
    public static String gerarTelefoneFixo() {
        return "(48)3" + gerarNumero(3) + "-" + gerarNumero(4);
    }

    // (48)93456-5899
    public static String gerarCelular() {
        return "(48)9" + gerarNumero(4) + "-" + gerarNumero(4);
    }

    //999.999.999-99
    public static String gerarCpf() {
        return gerarNumero(3) + "." + gerarNumero(3)
                + "." + gerarNumero(3) + "-" + gerarNumero(2);
    }

    public static String gerarSenha(int qtd) {
        String[] letras = {"$", "_", "0", "1", "2", "3", "4", "5",
            "6", "7", "8", "9",
            "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
            "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z",
            "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
            "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String senha = "";
        int indice;
        int tamanho = letras.length;
        for (int i = 0; i < qtd; i++) {
            indice = (int) (Math.random() * tamanho);
            senha += letras[indice];
        }
        return senha;
    }

    public static String gerarCep() {
        List<String> ceps = Arrays.asList("88101-310", "88110-400",
                "88132-862", "88070-101", "88108-100", "88108-190",
                "88115-520", "88135-320", "88053-401", "88137-210",
                "88115-060");
        Collections.shuffle(ceps);
        return ceps.get(0);
    }

    public static String gerarLogin() {
        List<String> nomes = Arrays.asList("junior", "silvio",
                "elisangela", "ana", "paula", "carla",
                "jonata", "bruno", "paulo", "tiago", "pedro",
                "douglas", "mauricio", "flavia", "clara",
                "cristovão", "cristofer", "igor", "maruan",
                "luiz");
        Collections.shuffle(nomes);
        return nomes.get(0).toLowerCase();
    }

    public static String gerarNome() {
        List<String> nomes = Arrays.asList("Junior", "Silvio",
                "Elisangela", "Ana", "Paula", "Carla",
                "Jonata", "Bruno", "Paulo", "Tiago", "Pedro",
                "Douglas", "Mauricio", "Flavia", "Clara",
                "Cristovão", "Cristofer", "Igor", "Maruan",
                "Luiz");
        Collections.shuffle(nomes);
        return nomes.get(0) + " " + gerarSobrenome();
    }

    private static String gerarSobrenome() {
        List<String> sobrenome = Arrays.asList("Santos", "Abreu",
                "Silva", "Costa", "Prazeres", "Souza",
                "Vidal", "Freitas", "Ferreira", "Medeiro",
                "Martins", "Nunes", "Cardoso", "Machado",
                "Amorim", "Corrêa", "Gonçalves", "Azevedo");
        Collections.shuffle(sobrenome);
        return sobrenome.get(0);
    }

//    public static void main(String[] args) {
//        System.out.println("CEP: " + gerarCep());
//    }
}
