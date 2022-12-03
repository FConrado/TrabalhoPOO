package br.inatel.finalpoo.control;

import java.io.*;

public class Arquivo {

    OutputStream fluxoSaida;
    OutputStreamWriter geradorFluxoSaida;
    BufferedWriter bufferSaida;

    public void EscreveAvaliacoes(String f, float n){
        String path;
        String voto = "";

        try{
            voto = String.valueOf(n);
        }catch(Exception e){

        }

        switch(f){
            case "Amor Sublime Amor" -> path = "C:\\Users\\conra\\OneDrive\\ProjetoPOO\\AmorSublimeAmor.txt";
            case "Ataque dos cães" -> path = "C:\\Users\\conra\\OneDrive\\ProjetoPOO\\AtaqueDosCaes.txt";
            case "Duna" -> path = "C:\\Users\\conra\\OneDrive\\ProjetoPOO\\Duna.txt";
            case "Drive my car" -> path = "C:\\Users\\conra\\OneDrive\\ProjetoPOO\\DriveMyCar.txt";
            default -> path = "C:\\Users\\conra\\OneDrive\\ProjetoPOO\\TickTickBoom.txt";
        }
        try {

            //Inicializando os objetos
            fluxoSaida = new FileOutputStream(path,true);
            geradorFluxoSaida = new OutputStreamWriter(fluxoSaida);
            bufferSaida = new BufferedWriter(geradorFluxoSaida);

            //Escrita no arquivo
            bufferSaida.write(voto);
            bufferSaida.newLine();

        }catch (Exception e){
            System.err.printf(String.valueOf(e));
        } finally {
            //Bloco finally para fechar o buffer independente se teve exception ou não
            try {
                assert bufferSaida != null;
                bufferSaida.close();
            } catch (IOException e) {
                System.err.printf(String.valueOf(e));
            }
        }
    }
}
