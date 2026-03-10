package htl.swp2.Dateiimport.oop.onlineShop.OnlineShop;

public class Produkt {

    private String produktname;
    private double preis;
    private double ust;

    public Produkt(String produktname, double preis, double ust) {
        this.produktname = produktname;
        this.preis = preis;
        this.ust = ust;
    }

    public double getBruttoPreis(){
        double bruttoPreis = preis *ust;
        return bruttoPreis;
    }

    public double getPreis(){
        return preis;
    }

    public double getUst(){
        return ust;
    }


}
