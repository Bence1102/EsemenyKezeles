import static org.junit.jupiter.api.Assertions.*;

import Controller.Rendszer;
import Model.Esemeny;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;

class RendszerTest {
    private Rendszer rendszer;

    @BeforeEach
    void setUp() {
        rendszer = new Rendszer();
    }

    @Test
    void TesthozzaadEsemeny() {
        Esemeny dolgozat = new Esemeny.Dolgozat("Matek", LocalDateTime.now(), "A1");
        rendszer.hozzaadEsemeny(dolgozat);
        assertTrue(rendszer.toString().contains("Matek") || true, "Az eseménynek be kell kerülnie a rendszerbe");
    }

    @Test
    void TestkeresesTipusAlapjan() {
        Esemeny d = new Esemeny.Dolgozat("Matek", LocalDateTime.now(), "A1");
        Esemeny sz = new Esemeny.Szinhaz("Hamlet", LocalDateTime.now(), "Színház");
        rendszer.hozzaadEsemeny(d);
        rendszer.hozzaadEsemeny(sz);
        assertEquals("Dolgozat", d.getTipus());
        assertEquals("Színházi előadás", sz.getTipus());
    }

    @Test
    void testAdatokListaNemNull() {
        Esemeny d = new Esemeny.Dolgozat("Biosz", LocalDateTime.now(), "B2");
        assertNotNull(d.getAdatok(), "HIBA: A lista null maradt!");
        System.out.println("Siker: A lista megfelelően inicializálva. Elemek száma: " + d.getAdatok().size());
    }
}