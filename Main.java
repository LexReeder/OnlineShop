package htl.swp2.Dateiimport.oop.onlineShop.OnlineShop;

public class Main {
    public static void main(String[] args) {

        Anschrift a1 = new Anschrift("23", "4574", "alsdk","asdas");
        Anschrift a2 = new Anschrift("53", "3454", "hkl","qwer");
        Anschrift a3 = new Anschrift("67", "7890", "adg","afkgh");
        Anschrift a4 = new Anschrift("14", "6170", "Zirl","Sonnenweg");
        Kunde k1 = new Kunde("Lex", "Reeder",a1);
        Kunde k2 = new Kunde("bob", "miller", a2);
        Kunde k3 = new Kunde("Mark", "Lager", a3);


        k1.kundenProfilAnzeigen();
        k2.kundenProfilAnzeigen();
        k3.kundenProfilAnzeigen();
        // Kunde ohne Anschrift erstellen
        Kunde k4 = new Kunde("Simon", "Schober");
        // Anschrift hinzufügen
        k4.setAnschrift(a4);
        k4.kundenProfilAnzeigen();

        Produkt p1 = new Produkt("Laptop", 999.999, 0.20);
        Produkt p2 = new Produkt("Smartphone", 500.00, 0.20);
        Produkt p3 = new Produkt("Waschmaschine", 245.94, 0.20);

        Bestellung b = new Bestellung(101, k4);
        b.produktHinzufuegen(p1);
        b.produktHinzufuegen(p2);
        b.produktHinzufuegen(p3);

        b.rechnungDrucken();

        b.produktEntfernen(p1);



    }
}
