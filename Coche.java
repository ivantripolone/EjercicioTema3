public class Coche {
    private int numeroDePuertas;

    public Coche(int puertas) {
        this.numeroDePuertas = puertas;
    }

    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }

    public void addPuertas(int puertas){
        this.numeroDePuertas = this.numeroDePuertas + puertas;
    }

}
