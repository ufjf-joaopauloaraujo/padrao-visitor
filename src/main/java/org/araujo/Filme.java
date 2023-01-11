package org.araujo;

public class Filme implements Obra {

    private String nome;
    private String atores;
    private String diretor;
    private String ano;

    public Filme(String nome, String atores, String diretor, String ano) {
        this.nome = nome;
        this.atores = atores;
        this.diretor = diretor;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public String getAtores() {
        return atores;
    }

    public String getDiretor() {
        return diretor;
    }

    public String getAno() {
        return ano;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirFilme(this);
    }

}
