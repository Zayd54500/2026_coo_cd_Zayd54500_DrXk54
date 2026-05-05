package Test;

import donnees.Magasin;
import donnees.CD;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTriAlbum {
    public void testTrierAlbum() {
        Magasin magasin = new Magasin();
        CD cd1 = new CD("Artiste 1", "Z album");
        CD cd2 = new CD("Artiste 2", "A album");
        CD cd3 = new CD("Artiste 3", "M album");

        magasin.ajouteCd(cd1);
        magasin.ajouteCd(cd2);
        magasin.ajouteCd(cd3);

        magasin.trierAlbum();

        assertEquals("A Album", magasin.getCd(0).getNomCD());
        assertEquals("Z Album", magasin.getCd(2).getNomCD());
    }
}
