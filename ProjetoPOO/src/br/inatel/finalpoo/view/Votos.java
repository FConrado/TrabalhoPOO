package br.inatel.finalpoo.view;
import br.inatel.finalpoo.model.*;

import javax.swing.*;

public class Votos {

    public static void votacao(Usuario user, Filme f) {
        Float[] options = {1f, 1.5f, 2f, 2.5f, 3f, 3.5f, 4f, 4.5f, 5f};
        try {
            float n = (float) JOptionPane.showInputDialog(null, "Digite seu voto para " + f.getNome(),
                    "Avaliação: " + user.getNome(), JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            user.Vota(f, n);

        } catch (Exception e) {
            System.out.println("Excepction da funcao");
            votacao(user, f);
        }
    }
}
