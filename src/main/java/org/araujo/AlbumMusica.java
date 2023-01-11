package org.araujo;

public class AlbumMusica implements Obra {

    private String nome;
    private String interprete;
    private String gravadora;
    private String ano;

    public AlbumMusica(String nome, String interprete, String gravadora, String ano) {
        this.nome = nome;
        this.interprete = interprete;
        this.gravadora = gravadora;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public String getInterprete() {
        return interprete;
    }

    public String getGravadora() {
        return gravadora;
    }

    public String getAno() {
        return ano;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirAlbumMusica(this);
    }

}
