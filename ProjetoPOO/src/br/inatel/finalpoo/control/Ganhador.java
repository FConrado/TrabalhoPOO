package br.inatel.finalpoo.control;
import br.inatel.finalpoo.model.Filme;

import javax.swing.*;
import java.util.*;
public class Ganhador {
    static List<Float> notasFinais = new ArrayList<>();

    public static void adicionaNotaFinal(float notafinal){
        notasFinais.add(notafinal);
    }

    public static void revelaGanhador(Filme f1, Filme f2, Filme f3, Filme f4, Filme f5){
        int ganhador;
        String FilmeGanhador = "null";
        String DiretorGanhador = "null";
        ganhador = notasFinais.indexOf(Collections.max(notasFinais));

        switch (ganhador){
            case 0 -> {FilmeGanhador = f1.getNome(); DiretorGanhador = f1.getDiretor();}
            case 1 -> {FilmeGanhador = f2.getNome(); DiretorGanhador = f2.getDiretor();}
            case 2 -> {FilmeGanhador = f3.getNome(); DiretorGanhador = f3.getDiretor();}
            case 3 -> {FilmeGanhador = f4.getNome(); DiretorGanhador = f4.getDiretor();}
            case 4 -> {FilmeGanhador = f5.getNome(); DiretorGanhador = f5.getDiretor();}
        }

        JOptionPane.showMessageDialog(null,"O ganhador foi " + FilmeGanhador + " de " + DiretorGanhador + "!");
    }
}
