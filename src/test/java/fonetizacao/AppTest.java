package fonetizacao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testarS() {
        Fonetizacao fonetizacao = Fonetizacao.getInstance();
        assertEquals(fonetizacao.fonetizar("CAZA"), "CAXA");
        assertEquals(fonetizacao.fonetizar("CASA"), "CAXA");
        assertEquals(fonetizacao.fonetizar("CASSA"), "CAXA");
        assertEquals(fonetizacao.fonetizar("CAÇA"), "CAXA");
        assertEquals(fonetizacao.fonetizar("RATO"), "RATO");
        assertEquals(fonetizacao.fonetizar("HATO"), "RATO");
        assertEquals(fonetizacao.fonetizar("CARRO"), "CARO");
        assertEquals(fonetizacao.fonetizar("CAHO"), "CARO");
    }
}
