package org.araujo;

public interface Visitor {

    String exibirFilme(Filme filme);
    String exibirAlbumMusica(AlbumMusica album);
    String exibirQuadro(Quadro quadro);

}
