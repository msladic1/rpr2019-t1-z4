package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl[] artikli = new Artikl[50];
    private int brojArtikala = 0;

    public Artikl[] getArtikli() {
        return artikli;
    }

    public boolean dodajArtikl(Artikl artikl) {
        if(brojArtikala <= 1000) {
            this.artikli[brojArtikala] = new Artikl(artikl);
            brojArtikala = brojArtikala + 1;
            return true;
        }
        else
            return false;
    }
}
