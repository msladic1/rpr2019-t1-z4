package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] artikli = new Artikl[1000];
    private int brojArtikala = 0;

    public void dodajArtikl(Artikl artikl) {
        if(brojArtikala <= 1000) {
            this.artikli[brojArtikala] = new Artikl(artikl);
            brojArtikala = brojArtikala + 1;
        }
    }

    public Artikl[] getArtikli() {
        return this.artikli;
    }

    public Artikl izbaciArtiklSaKodom(String s) {
        for(int i = 0; i < this.brojArtikala; i++){
            if(this.artikli[i].getKod().equals(s)){
                Artikl artikl = new Artikl(this.artikli[i]);
                brojArtikala = brojArtikala - 1;
                if (this.brojArtikala - i >= 0)
                    System.arraycopy(this.artikli, i + 1, this.artikli, i, this.brojArtikala - i);
                this.artikli[brojArtikala] = null;
                return artikl;
            }
        }
        return null;
    }
}
