package View;

import Model.Esemeny;
import Model.Intezmeny;
import Controller.Rendszer;

import java.time.LocalDateTime;

public class PrgIndito {
    public static void main(String[] args) {
        Intezmeny iskola = new Intezmeny("Neumann János Egyetem", "Kecskemét, Izsáki út 10.");
        iskola.intezmenyInfo();

        Esemeny dolgozat = new Esemeny.Dolgozat("Matek ZH", LocalDateTime.of(2026, 3, 15, 10, 0), "A/1 terem");
        Esemeny eloadas = new Esemeny.Szinhaz("Hamlet", LocalDateTime.of(2026, 4, 20, 19, 0), "Városi Színház");


        iskola.getRendszer().hozzaadEsemeny(dolgozat);
        iskola.getRendszer().hozzaadEsemeny(eloadas);
        iskola.getRendszer().osszesEsemenyListazasa();
    }
}