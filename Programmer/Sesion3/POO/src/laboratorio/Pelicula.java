package laboratorio;

public class Pelicula extends Item {
    protected float calcularImporte(Alquiler contrato) {
        int importe = 2 * contrato.getDias();
        return importe;
    }
}