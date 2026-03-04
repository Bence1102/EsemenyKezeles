package Model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

//Kész

public class Esemeny {
    private String nev;
    private String tipus;
    private LocalDateTime idopont;
    private String helyszin;
    private List<String> adatok = new ArrayList<>();

    public Esemeny(String nev, LocalDateTime idopont, String helyszin,String tipus) {
        this.nev = nev;
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
        System.out.println("Név: " + nev + " | Időpont: " + idopont + " | Helyszín: " + helyszin + " | Típus: " + tipus);
        if (adatok != null && !adatok.isEmpty()) {
            System.out.println("   -> Kapcsolódó adatok: " + adatok);
        }
    }

    public static class Szinhaz extends Esemeny {
        public Szinhaz(
                String nev,
                LocalDateTime idopont,
                String helyszin
        )
        {
            super(nev, idopont, helyszin, "Színházi előadás");
            this.getAdatok().add("Szünet: 15 perc");
            this.getAdatok().add("Ruhatár: Ingyenes");
        }
    }

    public static class Dolgozat extends Esemeny {
        public Dolgozat(
                String nev,
                LocalDateTime idopont,
                String helyszin
        ) {
            super(nev, idopont, helyszin, "Dolgozat");
            this.getAdatok().add("Számológép használható");
            this.getAdatok().add("Függvénytáblázat megengedett");
        }
    }

    @Override
    public String toString() {
        return "Model.Esemeny{" +
                "nev='" + nev + '\'' +
                ", tipus='" + tipus + '\'' +
                ", idopont=" + idopont +
                ", helyszin='" + helyszin + '\'' +
                ", adatok=" + adatok +
                '}';
    }
}
