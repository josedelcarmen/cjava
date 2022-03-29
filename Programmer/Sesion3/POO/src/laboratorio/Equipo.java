package laboratorio;

public class Equipo extends Item {
    protected float calcularImporte(Alquiler contrato) {
        int seguroEquipo = 50;
        int importe = seguroEquipo + 5*contrato.getDias();
        return seguroEquipo + importe;
    }
}