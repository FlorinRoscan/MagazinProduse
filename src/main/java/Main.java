public class Main {
    public static void main(String[] args) {
        // initializam cateva produse
        Produs produs1 = new Produs("Lapte", 2.5, 10);
        Produs produs2 = new ProdusAlimentar("Branza", 5.0, 8, "2023-03-31");
        Produs produs3 = new Produs("Cartofi", 1.5, 20);
        Produs produs4 = new ProdusElectronic("Telefon", 1200.0, 5, "Samsung");
        Produs produs5 = new ProdusElectronic("Televizor", 2500.0, 3, "LG");
        Produs produs6 = new ProdusAlimentar("Ciocolata", 3.0, 15, "2023-05-31");
        Produs produs7 = new Produs("Apa", 2.0, 50);
        Produs produs8 = new Produs("Paine", 2.0, 15);
        Produs produs9 = new ProdusElectronic("Laptop", 10.000, 2, "Apple");
        Produs produs10 = new Produs("Sare", 3.0, 30);

        // afisam detaliile produselor
        produs1.afiseazaDetalii();
        produs2.afiseazaDetalii();
        produs3.afiseazaDetalii();
        produs4.afiseazaDetalii();
        produs5.afiseazaDetalii();
        produs6.afiseazaDetalii();
        produs7.afiseazaDetalii();
        produs8.afiseazaDetalii();
        produs9.afiseazaDetalii();
        produs10.afiseazaDetalii();

        produs1.vinde(3);
        produs4.vinde(2);
        produs6.vinde(4);
        produs3.vinde(3);
        produs9.vinde(1);

        // afisam din nou detaliile produselor actualizate
        System.out.println("Dupa vanzari:");
        produs1.afiseazaDetalii();
        produs2.afiseazaDetalii();
        produs3.afiseazaDetalii();
        produs4.afiseazaDetalii();
        produs5.afiseazaDetalii();
        produs6.afiseazaDetalii();
        produs7.afiseazaDetalii();
        produs8.afiseazaDetalii();
        produs9.afiseazaDetalii();
        produs10.afiseazaDetalii();
    }
}


