package htl.swp2.Dateiimport.oop.onlineShop.OnlineShop;

public class Main {
    public static void main(String[] args) {

        Anschrift a1 = new Anschrift("23", "4574", "alsdk","asdas");
        Anschrift a2 = new Anschrift("53", "3454", "hkl","qwer");
        Anschrift a3 = new Anschrift("67", "7890", "adg","afkgh");
        Kunde k1 = new Kunde("Lex", "Reeder",a1);
        Kunde k2 = new Kunde("bob", "miller", a2);
        Kunde k3 = new Kunde("Mark", "Lager", a3);


        k1.kundenProfilAnzeigen();
        k2.kundenProfilAnzeigen();
        k3.kundenProfilAnzeigen();

    }
}
