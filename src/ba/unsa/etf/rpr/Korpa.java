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

    public int dajUkupnuCijenuArtikala() {
        int ukupnaCijena = 0;
        for(int i = 0; i < brojArtikala; i++){
            ukupnaCijena = ukupnaCijena + artikli[i].getCijena();
        }
        return ukupnaCijena;
    }
}
