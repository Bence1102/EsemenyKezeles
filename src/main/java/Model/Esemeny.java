package Model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import Model.Felhasznalo;


//Kész

public class Esemeny {
    private String nev;
    private String fehasznalo;
    private String felhasaznalo2;
    private String tipus;
    private LocalDateTime idopont;
    private String helyszin;
    private List<String> adatok = new ArrayList<>();

    public Esemeny(String nev,String fehasznalo,LocalDateTime idopont, String helyszin,String tipus) {
        this.nev = nev;
        this.fehasznalo = fehasznalo;
        this.tipus = tipus;
        this.idopont = idopont;
        this.helyszin = helyszin;
    }

    public String getNev() {
        return nev;
    }

    public String getTipus() {
        return tipus;
    }

    public String getFehasznalo() {
        return fehasznalo;
    }

    public void setFehasznalo(String fehasznalo) {
        this.fehasznalo = fehasznalo;
    }

    public LocalDateTime getIdopont() {
        return idopont;
    }

    public String getHelyszin() {
        return helyszin;
    }

    public List<String> getAdatok() {
        return adatok;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public void setIdopont(LocalDateTime idopont) {
        this.idopont = idopont;
    }

    public void setHelyszin(String helyszin) {
        this.helyszin = helyszin;
    }

    public void setAdatok(List<String> adatok) {
        this.adatok = adatok;
    }

    public void esemenyletrehoz(String ujAdat){
        this.adatok.add(ujAdat);
    }

    public void esemenynyilvantart(){
        System.out.println("Név: " + nev + " | Résztvevő:"+ fehasznalo + " | Időpont: " + idopont + " | Helyszín: " + helyszin + " | Típus: " + tipus);
        if (adatok != null && !adatok.isEmpty()) {
            System.out.println("   -> Kapcsolódó adatok: " + adatok);
        }
    }

    public static class Szinhaz extends Esemeny {
        public Szinhaz(
                String nev,
                String fehasznalo,
                LocalDateTime idopont,
                String helyszin
        )
        {
            super(nev,fehasznalo,idopont, helyszin, "Színházi előadás");
            this.getAdatok().add("Szünet: 15 perc");
            this.getAdatok().add("Ruhatár: Ingyenes");
        }
    }

    public static class Dolgozat extends Esemeny {
        public Dolgozat(
                String nev,
                String fehasznalo2,
                LocalDateTime idopont,
                String helyszin
        ) {
            super(nev,fehasznalo2, idopont, helyszin, "Dolgozat");
            this.getAdatok().add("Számológép használható");
            this.getAdatok().add("Függvénytáblázat megengedett");
        }
    }

    @Override
    public String toString() {
        return "Model.Esemeny{" +
                "nev='" + nev + '\'' +
                ", Résztvevő='" + fehasznalo + '\'' +
                ", tipus='" + tipus + '\'' +
                ", idopont=" + idopont +
                ", helyszin='" + helyszin + '\'' +
                ", adatok=" + adatok +
                '}';
    }
}
