package Model;

import Controller.Rendszer;

public class Intezmeny {
    private String intezmenyNev;
    private String cim;
    private Rendszer esemenyKezeloRendszer;

    public Intezmeny(String intezmenyNev, String cim) {
        this.intezmenyNev = intezmenyNev;
        this.cim = cim;
        this.esemenyKezeloRendszer = new Rendszer();
    }

    public Rendszer getRendszer() {
        return esemenyKezeloRendszer;
    }

    public void intezmenyInfo() {
        System.out.println("=== Intézmény: " + intezmenyNev + " (" + cim + ") ===");
    }


    public String getIntezmenyNev() {
        return intezmenyNev;
    }
    public void setIntezmenyNev(String intezmenyNev) {
        this.intezmenyNev = intezmenyNev;
    }
    public String getCim() {
        return cim;
    }
    public void setCim(String cim) {
        this.cim = cim;
    }
}