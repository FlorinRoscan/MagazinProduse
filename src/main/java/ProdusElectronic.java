class ProdusElectronic extends Produs {
    String producator;

    public ProdusElectronic(String nume, double pret, int cantitate, String producator) {
        super(nume, pret, cantitate);
        this.producator = producator;
    }

    public void afiseazaDetalii() {
        System.out.println(nume + ": pret " + pret + ", cantitate " + cantitate + ", produs de " + producator);
    }
}