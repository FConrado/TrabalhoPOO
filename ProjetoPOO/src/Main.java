import br.inatel.finalpoo.control.Ganhador;
import br.inatel.finalpoo.model.Filme;
import br.inatel.finalpoo.model.Nominados;
import br.inatel.finalpoo.model.Usuario;
import br.inatel.finalpoo.view.Votos;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Nominados catalogo = new Nominados(); // Objeto para criacao dos filmes
        Set<Filme> catalog = new HashSet<>(); // Set para guardar os filmes

        // adiciona os filmes no catalogo
        catalog.add(catalogo.f1);
        catalog.add(catalogo.f2);
        catalog.add(catalogo.f3);
        catalog.add(catalogo.f4);
        catalog.add(catalogo.f5);

        // cria os usuarios dos avaliadores
        Usuario u1 = new Usuario("Pedro");
        Usuario u2 = new Usuario("Maria");
        Usuario u3 = new Usuario("Carlos");

        //inicia o processo de votação para cada usuario
        for(Filme catalo : catalog){
            Votos.votacao(u1, catalo);
        }

        for(Filme catalo : catalog){
            Votos.votacao(u2, catalo);
        }

        for(Filme catalo : catalog){
            Votos.votacao(u3, catalo);
        }


        // Computa a nota final de cada filme
        Ganhador.adicionaNotaFinal(catalogo.f1.AvaliacaoFinal());
        Ganhador.adicionaNotaFinal(catalogo.f2.AvaliacaoFinal());
        Ganhador.adicionaNotaFinal(catalogo.f3.AvaliacaoFinal());
        Ganhador.adicionaNotaFinal(catalogo.f4.AvaliacaoFinal());
        Ganhador.adicionaNotaFinal(catalogo.f5.AvaliacaoFinal());

        // Avalia o vencedor
        Ganhador.revelaGanhador(catalogo.f1,catalogo.f2,catalogo.f3,catalogo.f4,catalogo.f5);
    }
}
