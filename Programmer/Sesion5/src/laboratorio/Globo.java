package laboratorio;

public class Globo extends NaveAerea implements Conducible{
    private int volumenGas;
    public void setVolumenGas(int volumenGas) {
        this.volumenGas= volumenGas;
    }
    public int getVolumenGas() {
        return this.volumenGas;
    }

    @Override
    public void girarIzquierda(int grados) {
        if (getDireccion()=='S' && grados==90) setDireccion('O');
    }

    public void girarDerecha(int grados) {
        if (getDireccion()=='N' && grados==90) setDireccion('E');
    }
}
