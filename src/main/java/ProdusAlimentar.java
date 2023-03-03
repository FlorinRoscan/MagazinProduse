class ProdusAlimentar extends Produs {
    String dataExpirare;

    public ProdusAlimentar(String nume, double pret, int cantitate, String dataExpirare) {
        super(nume, pret, cantitate);
        this.dataExpirare = dataExpirare;
    }

    public void afiseazaDetalii() {
        System.out.println(nume + ": pret " + pret + ", cantitate " + cantitate + ", expira la " + dataExpirare);
    }
}
