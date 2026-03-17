package htl.swp2.Dateiimport.oop.onlineShop.OnlineShop;

public class Kunde {

    private String vorname;
    private Anschrift anschrift;
    private String nachname;

    public Kunde(String vorname, String nachname, Anschrift anschrift) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.anschrift = anschrift;
    }
    // zweiter Konstrukter für Kunde ohne Adresse
    public Kunde(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public Anschrift getAnschrift() {
        return anschrift;
    }

    public void setAnschrift(Anschrift anschrift) {
        this.anschrift = anschrift;
    }

    public void kundenProfilAnzeigen(){
        System.out.println("Kundendaten:");
        System.out.println("Vorname: " + vorname + "\nNachname: " + nachname+ "\nAdresse: " + anschrift.getVollstaendigeAdresse());
        System.out.println("-----------------------------------------------------------------------------------------");
    }

    public String getKundenProfilAnzeigen() {
        String kundenProfil = "Kundendaten:\n" +
                "Vorname: " + vorname + "\n" +
                "Nachname: " + nachname + "\n" +
                "Adresse: " + anschrift.getVollstaendigeAdresse() + "\n" +
                "------------------------------------------------------";

        System.out.println(kundenProfil);
        return kundenProfil;
    }



}
