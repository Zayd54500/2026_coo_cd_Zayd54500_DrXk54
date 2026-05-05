import donnees.Magasin;
import donnees.CD;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTrierArtiste {

    public void testTrierArtiste() {
        Magasin magasin = new Magasin();

        CD cd1 = new CD("Zebda", "Essence ordinaire");
        CD cd2 = new CD("Benabar", "Risques du métier");
        CD cd3 = new CD("Gorillaz", "Demon Days");

        magasin.ajouteCd(cd1);
        magasin.ajouteCd(cd2);
        magasin.ajouteCd(cd3);

        magasin.trierArtiste();

        assertEquals("Benabar", magasin.getCd(0).getNomArtiste());
        assertEquals("Zebda", magasin.getCd(2).getNomArtiste());
    }
}