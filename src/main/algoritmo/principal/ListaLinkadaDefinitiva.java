package main.algoritmo.principal;

import main.escrita.EscritorArquivo;
import main.leitura.LeitoraCaractereLinked;

import java.util.LinkedList;

public class ListaLinkadaDefinitiva {

    private final static String CASO = "caso8";
    private final static String PATH = "src/resources/casos/" + CASO + ".txt";

    private static Character simboloDiferente(Character simbolo1, Character simbolo2) {
        if ((simbolo1 == 'D' || simbolo1 == 'N') && (simbolo2 == 'N' || simbolo2 == 'D'))
            return 'A';
        else if ((simbolo1 == 'D' || simbolo1 == 'A') && (simbolo2 == 'A' || simbolo2 == 'D'))
            return 'N';
        else
            return 'D';
    }

    public static LinkedList<Character> algoritmo(LinkedList<Character> palavra){
        int i = 1;
        char primeiroSimbolo = palavra.get(0);
        while(i < palavra.size()){
            if (primeiroSimbolo != palavra.get(i)){
                palavra.add(simboloDiferente(primeiroSimbolo, palavra.get(i)));
                palavra.remove(i-1);
                palavra.remove(i-1);

                primeiroSimbolo = palavra.get(0);
                i = (i - 1);
            } else{
                i++;
            }
        }
        System.out.println("Final");
        System.out.println(palavra);
        return palavra;
    }

    public static void main(String[] args) {
        System.out.println("-------- Teste com LinkedList --------");

        LeitoraCaractereLinked leitora = new LeitoraCaractereLinked();
        LinkedList<Character> palavra = leitora.getCadeiaDeCaracteres(PATH);

        long startTime = System.nanoTime();
        algoritmo(palavra);
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;

        System.out.println("O tempo de execucao: " + executionTime + " ns.");

        /** Codigo que gera o arquivo de saida dentro de src/resources/saidas/
         * EscritorArquivo escritor = new EscritorArquivo("src/resources/saidas/saida-" + caso + ".txt", caso);
         * escritor.escreveNoArquivo(cadeia, executionTime);
         */
        
    }
}
