package entidad;

public class Persona {
    /* Variables de clase: no requiere de objetos, se accesa directo
    * Java siempre recuerda su último valor que se le asigna */
    public static int ultimoCodigo = 0;
    /* Variables de instancia (propiedades o campos): para usarlas hay que crear un objeto */
    private int codigo;
    private String dni;
    private String nombres, apellidos;

    /* Métodos accesores: Permiten obtener / modificar los datos de
    las variables privadas o de instancia, deben ser públicos
    Getters (para obtener el valor) y Setters (cambiar el valor) de
    las variables de instancia
    */

    /* Constructores: crean objetos en memoria */
    public Persona() {
        ultimoCodigo++;
        this.codigo = ultimoCodigo; // this es para accesar a un miembro de un objeto
    }

    public Persona(String dni, String nombres, String apellidos) {
        this(); // Llamando al primer constructor
        // inicializando valores para las otras 3 propiedades
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "codigo=" + codigo +
                ", dni='" + dni + '\'' +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                '}';
    }
}
