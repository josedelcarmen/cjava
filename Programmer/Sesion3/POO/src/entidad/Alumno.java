package entidad;

public class Alumno extends Persona{
    /* Variables de Instancia */
    private int creditosAcumulados;
    private double promedioAcumulado;

    /* Métodos constructores */

    public Alumno(String dni, String nombres, String apellidos,
                  int creditosAcumulados, double promedioAcumulado) {
        // Lamando al constructor de la super clase
        super(dni, nombres, apellidos);
        this.creditosAcumulados = creditosAcumulados;
        this.promedioAcumulado = promedioAcumulado;
    }

    /* Métodos accesores */
    public int getCreditosAcumulados() {
        return creditosAcumulados;
    }

    public void setCreditosAcumulados(int creditosAcumulados) {
        this.creditosAcumulados = creditosAcumulados;
    }

    public double getPromedioAcumulado() {
        return promedioAcumulado;
    }

    public void setPromedioAcumulado(double promedioAcumulado) {
        this.promedioAcumulado = promedioAcumulado;
    }

    @Override
    public String toString() {
        return "" + super.toString() + ", " +
                "creditosAcumulados=" + creditosAcumulados +
                ", promedioAcumulado=" + promedioAcumulado;
    }
}
