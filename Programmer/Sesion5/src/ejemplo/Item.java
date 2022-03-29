package ejemplo;

public abstract class Item {
    protected String titulo;
    protected float precio = 5.0f;
    // Método abstracto: no implementa nada
    public abstract boolean esAlquilable();
    // Método no abstracto: porque implementa algo
    public float getPrecio() {
        return precio;
    }
}
