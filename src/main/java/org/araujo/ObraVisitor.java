package org.araujo;

public class ObraVisitor implements Visitor {

    public String exibir(Obra pessoa) {
        return pessoa.aceitar(this);
    }

    @Override
    public String exibirFilme(Filme filme) {
        return "Filme{" +
                "nome='" + filme.getNome() + '\'' +
                ", atores='" + filme.getAtores() + '\'' +
                ", diretor='" + filme.getDiretor() + '\'' +
                ", ano=" + filme.getAno() +
                '}';
    }

    @Override
    public String exibirAlbumMusica(AlbumMusica album) {
        return "AlbumMusica{" +
                "nome='" + album.getNome() + '\'' +
                ", interprete='" + album.getInterprete() + '\'' +
                ", gravadora='" + album.getGravadora() + '\'' +
                ", ano=" + album.getAno() +
                '}';
    }

    @Override
    public String exibirQuadro(Quadro quadro) {
        return "Quadro{" +
                "nome='" + quadro.getNome() + '\'' +
                ", artista='" + quadro.getArtista() + '\'' +
                ", material='" + quadro.getMaterial() + '\'' +
                ", ano=" + quadro.getAno() +
                ", acervo='" + quadro.getNomeAcervo() + '\'' +
                '}';
    }
}
