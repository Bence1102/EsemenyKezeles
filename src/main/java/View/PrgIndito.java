package View;

import Model.Esemeny;
import Model.Intezmeny;
import Controller.Rendszer;
import java.time.LocalDateTime;
import Model.Felhasznalo;

//Kész

public class PrgIndito {
    public static void main(String[] args) {
        Intezmeny iskola = new Intezmeny("Neumann János Egyetem", "Kecskemét, Izsáki út 10.");
        iskola.intezmenyInfo();

        Esemeny dolgozat = new Esemeny.Dolgozat("Matek ZH", "Dénes",LocalDateTime.of(2026, 3, 15, 10, 0), "A/1 terem");
        Esemeny eloadas = new Esemeny.Szinhaz("Hamlet", "Gábor",LocalDateTime.of(2026, 4, 20, 19, 0), "Vigh Színház");


        iskola.getRendszer().hozzaadEsemeny(dolgozat);
        iskola.getRendszer().hozzaadEsemeny(eloadas);
        iskola.getRendszer().osszesEsemenyListazasa();
    }
}