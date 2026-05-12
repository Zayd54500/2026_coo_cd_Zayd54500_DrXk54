package donnees;

public class ComparateurAlbum implements ComparateurCd {
    @Override
    public boolean etreAvant(CD cd1, CD cd2) {
        if (cd1.etreAvantAlbum(cd2)) {
            return true;
        }
        return false;
    }
}
