package entidad;

import java.util.Date;

public class Empleado extends Persona {
    private double sueldoBasico;
    private Date fechaIngreso;

    public double salario(int dias){
        return sueldoBasico + 50 * dias;
    }
    // Método sobrecargado: mismo nombre que otro método pero diferente numero de parametros
    public double salario(int inasistencias, int diasAsistencia){
        return sueldoBasico + 50 * (diasAsistencia - inasistencias);
    }

    public double salario(int tardanzas, int inasistencias, int diasAsistencia){
        return sueldoBasico + 50 * (diasAsistencia - inasistencias - tardanzas * 2);
    }

    /* Métodos accesores*/
    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        return super.toString() +
                " sueldoBasico = " + sueldoBasico +
                ", fechaIngreso = " + fechaIngreso;
    }
}
