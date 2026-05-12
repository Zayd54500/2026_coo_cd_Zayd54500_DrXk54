package donnees;

public class ComparateurArtiste implements ComparateurCd {
    @Override
    public boolean etreAvant(CD cd1, CD cd2) {
        if (cd1.etreAvantArtiste(cd2)) {
            return true;
        }
        return false;
    }
}
