package htl.swp2.Dateiimport.oop.onlineShop.OnlineShop;

import java.util.ArrayList;

public class Bestellung {
    private int bestellNummer;
    private Kunde kunde;
    private ArrayList<Produkt> warenkorb;

    public Bestellung(int bestellNummer,  Kunde kunde) {
        this.bestellNummer=bestellNummer;
        this.kunde=kunde;
        this.warenkorb = new ArrayList<>();
    }

    public void produktHinzufuegen(Produkt p){
        this.warenkorb.add(p);

    }

    public void rechnungDrucken(){
        System.out.println("RECHNUNG NR: "+ bestellNummer);
        kunde.kundenProfilAnzeigen();
        System.out.println("------------------------------------------------------");
        double gSumme = 0;
        // alle Produkte zusammenzählen
        for(Produkt p:warenkorb){
            gSumme += p.getBruttoPreis();
        }
        System.out.println("Gesamtpreis: "+ gSumme);
    }
}
