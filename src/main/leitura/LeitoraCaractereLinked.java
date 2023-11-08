package main.leitura;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class LeitoraCaractereLinked {
    public LinkedList<Character> getCadeiaDeCaracteres(String pathArquivo){
        LinkedList<Character> lista = new LinkedList<>();

        try (FileReader fileReader = new FileReader(pathArquivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            int caractere;
            while ((caractere = bufferedReader.read()) != -1) {
                if (caractere != '\n') {
                    char charLido = (char) caractere;
                    lista.add(charLido);
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }

        return lista;
    }

}
