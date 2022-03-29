package ejemplo;

public class Libro extends Item {
    @Override
    public boolean esAlquilable() {
        return false;
    }

    @Override
    public float getPrecio() {
        return 0.0f;
    }
}

