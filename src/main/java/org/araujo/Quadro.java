package org.araujo;

public class Quadro implements Obra {

    private String nome;
    private String artista;
    private String material;
    private String ano;
    private Acervo acervo;

    public Quadro(String nome, String artista, String material, String ano, Acervo acervo) {
        this.nome = nome;
        this.artista = artista;
        this.material = material;
        this.ano = ano;
        this.acervo = acervo;
    }

    public String getNome() {
        return nome;
    }

    public String getArtista() {
        return artista;
    }

    public String getMaterial() {
        return material;
    }

    public String getAno() {
        return ano;
    }

    public String getNomeAcervo() {
        return this.acervo.getNome();
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirQuadro(this);
    }

}
