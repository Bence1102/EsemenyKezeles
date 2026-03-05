package Model;

public class Felhasznalo {
    private String felhasznalo;
    private String felhasznalo2;

    public Felhasznalo(String felhasznalo2, String felhasznalo) {
        this.felhasznalo2 = felhasznalo2;
        this.felhasznalo = felhasznalo;
    }

    public String getFelhasznalo2() {
        return felhasznalo2;
    }

    public void setFelhasznalo2(String felhasznalo2) {
        this.felhasznalo2 = felhasznalo2;
    }

    public String getFelhasznalo() {
        return felhasznalo;
    }

    public void setFelhasznalo(String felhasznalo) {
        this.felhasznalo = felhasznalo;
    }

    @Override
    public String toString() {
        return "Felhasznalo{" +
                "felhasznalo2='" + felhasznalo2 + '\'' +
                ", felhasznalo='" + felhasznalo + '\'' +
                '}';
    }
}
