package org.araujo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ObraVisitorTest {

    @Test
    void deveExibirFilme() {
        Filme filme = new Filme("Pulp Fiction", "Bruce Willis;Samuel L. Jackson;John Travolta", "Quentin Tarantino", "1995");

        ObraVisitor visitor = new ObraVisitor();
        assertEquals("Filme{nome='Pulp Fiction', atores='Bruce Willis;Samuel L. Jackson;John Travolta', diretor='Quentin Tarantino', ano=1995}", visitor.exibir(filme));
    }

    @Test
    void deveExibirAlbumMusica() {
        AlbumMusica album = new AlbumMusica("The Dark Side of the Moon", "Pink Floyd", "Capitol Records", "1973");

        ObraVisitor visitor = new ObraVisitor();
        assertEquals("AlbumMusica{nome='The Dark Side of the Moon', interprete='Pink Floyd', gravadora='Capitol Records', ano=1973}", visitor.exibir(album));
    }

    @Test
    void deveExibirQuadro() {
        Quadro quadro = new Quadro("Mona Lisa", "Leonardo Da Vinci", "Tinta a óleo", "1503", new Acervo("Museu do Louvre"));

        ObraVisitor visitor = new ObraVisitor();
        assertEquals("Quadro{nome='Mona Lisa', artista='Leonardo Da Vinci', material='Tinta a óleo', ano=1503, acervo='Museu do Louvre'}", visitor.exibir(quadro));
    }

}