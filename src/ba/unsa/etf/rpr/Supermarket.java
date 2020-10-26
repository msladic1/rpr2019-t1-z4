package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] artikli = new Artikl[1000];
    private int brojArtikala = 0;

    public void dodajArtikl(Artikl artikl) {
        if(brojArtikala < 1000) {
            this.artikli[brojArtikala] = new Artikl(artikl);
            brojArtikala = brojArtikala + 1;
        }
    }

    public Artikl[] getArtikli() {
        return artikli;
    }
}
