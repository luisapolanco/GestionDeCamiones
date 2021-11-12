public class Camion {

    private double carga;
    private double kilometros;
    private Conductor conductor;

    public Camion(double carga, double kilometros, Conductor conductor) {
        this.carga = carga;
        this.kilometros = kilometros;
        this.conductor = conductor;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public double getKilometros() {
        return kilometros;
    }

    public void setKilometros(double kilometros) {
        this.kilometros = kilometros;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }
}
