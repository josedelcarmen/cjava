package laboratorio;

public class Juego extends Item {
    String fabricante;
    public Juego(String fabricante) {
        this.fabricante = fabricante;
    }
    public String getFabricante() {
        return fabricante;
    }
    protected float calcularImporte(Alquiler contrato) {
        String fabricante = this.fabricante;
        int tasa = 0;
        if (fabricante.equals("PlayStation")) tasa = 2;
        if (fabricante.equals("Nintendo")) tasa = 1;
        int importe = tasa*contrato.getDias();
        return importe;
    }
}
