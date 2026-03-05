package Controller;

import Model.Esemeny;

import java.util.ArrayList;
import java.util.List;
import Model.Felhasznalo;

//Kész

public class Rendszer {
    private List<Esemeny> esemenyek;

    public Rendszer() {
        this.esemenyek = new ArrayList<>();
    }

    public void hozzaadEsemeny(Esemeny e) {
        esemenyek.add(e);
        System.out.println("Sikeresen rögzítve: " + e.getNev());
    }
    public void osszesEsemenyListazasa() {
        System.out.println("\n--- Rendszerben lévő összes esemény ---");
        for (Esemeny e : esemenyek) {
            e.esemenynyilvantart();
        }
    }
    public void keresesTipusAlapjan(String keresettTipus) {
        System.out.println("\n--- Keresési eredmények (" + keresettTipus + ") ---");
        for (Esemeny e : esemenyek) {
            if (e.getTipus().equalsIgnoreCase(keresettTipus)) {
                e.esemenynyilvantart();
            }
        }
    }
    public void keresesHelyszinAlapjan(String helyszin) {
        System.out.println("\n--- Események ezen a helyszínen: " + helyszin + " ---");
        for (Esemeny e : esemenyek) {
            if (e.getHelyszin().contains(helyszin)) {
                e.esemenynyilvantart();
            }
        }
    }

}