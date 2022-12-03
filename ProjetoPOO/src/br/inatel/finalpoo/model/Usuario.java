package br.inatel.finalpoo.model;
import br.inatel.finalpoo.control.Arquivo;

public class Usuario {

    Arquivo arq = new Arquivo();

    private final String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void Vota(Filme f, float nota){
        f.adicionaAvaliacao(nota);
        arq.EscreveAvaliacoes(f.getNome(), nota);
    }

}
