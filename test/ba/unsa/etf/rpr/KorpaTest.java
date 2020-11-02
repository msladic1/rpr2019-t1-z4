package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {
    private Supermarket supermarket;

    @BeforeEach
    void initializeSupermarket() {
        supermarket = new Supermarket();
        supermarket.dodajArtikl(new Artikl("Hljeb",1,"hlb"));
    }

    @Test
    void test1(){
        supermarket.dodajArtikl(new Artikl("Banane", 2, "bnn"));
        Korpa korpa = new Korpa();

        korpa.dodajArtikl(new Artikl("Banane", 2, "bnn"));
        int cijena = korpa.dajUkupnuCijenuArtikala();
        assertEquals(2, cijena);
    }

    @Test
    void testIzbacivanja() {
        Korpa korpa = new Korpa();
        korpa.dodajArtikl(new Artikl("Hljeb",1,"hlb"));
        korpa.dodajArtikl(new Artikl("Banane", 2, "bnn"));
        Artikl a = korpa.izbaciArtiklSaKodom("hlb");
        assertEquals("hlb", a.getKod());
    }

    @Test
    void testDodavanja() {
        Korpa korpa = new Korpa();
        assertEquals(true, korpa.dodajArtikl(new Artikl("Banane", 2, "bnn")));
    }



}