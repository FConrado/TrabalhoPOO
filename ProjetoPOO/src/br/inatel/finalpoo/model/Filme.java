package br.inatel.finalpoo.model;

import java.util.ArrayList;

public class Filme {
    final private String nome;
    final private String diretor;

    public Filme(String nome, String diretor) {
        this.nome = nome;
        this.diretor = diretor;
    }

    public String getNome() {
        return nome;
    }

    public String getDiretor() {
        return diretor;
    }

    ArrayList<Float> avaliacoes = new ArrayList<>();

    public void adicionaAvaliacao(float avaliacao){
        avaliacoes.add(avaliacao);
    }

    public float AvaliacaoFinal(){
        float soma = 0;
        for (Float avaliacoe : avaliacoes) soma += avaliacoe;
        return soma/avaliacoes.size();
    }
}
