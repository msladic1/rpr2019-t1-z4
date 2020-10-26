package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] artikl = new Artikl[1000];
    private int brojArtikala = 0;

    public void dodajArtikl(Artikl artikl) {
        if(brojArtikala < 1000) {
            this.artikl[brojArtikala] = new Artikl(artikl);
            brojArtikala = brojArtikala + 1;
        }
    }
}
