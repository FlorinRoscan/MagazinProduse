class Produs {
    public String nume;
    public double pret;
    public int cantitate;
    public Produs(String nume, double pret, int cantitate) {
        this.nume = nume;
        this.pret = pret;
        this.cantitate = cantitate;
    }

    void vinde(int cantitateVanduta) {
        if (cantitateVanduta <= cantitate) {
            cantitate -= cantitateVanduta;
            System.out.println("S-au vandut " + cantitateVanduta + " buc. din produsul " + nume);
        } else {
            System.out.println("Nu sunt suficiente stocuri pentru a vinde " + cantitateVanduta + " buc. din produsul " + nume);
        }
    }
    public void afiseazaDetalii() {
        System.out.println(nume + ": pret " + pret + ", cantitate " + cantitate);
    }
}
