package htl.swp2.Dateiimport.oop.onlineShop.OnlineShop;

import org.w3c.dom.ls.LSOutput;

public class Anschrift {

    private String hausnummer;
    private String plz;
    private String stadt;
    private String strasse;

    public Anschrift(String hausnummer, String plz, String stadt, String strasse) {
        this.hausnummer = hausnummer;
        this.plz = plz;
        this.stadt = stadt;
        this.strasse = strasse;
    }

    public String getHausnummer() {
        return hausnummer;
    }

    public void setHausnummer(String hausnummer) {
        this.hausnummer = hausnummer;
    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public String getStadt() {
        return stadt;
    }

    public void setStadt(String stadt) {
        this.stadt = stadt;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public String getVollstaendigeAdresse(){

        return stadt  + " " + strasse + " " + plz + " " + hausnummer;
    }
}
