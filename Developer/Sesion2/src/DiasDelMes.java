public class DiasDelMes {
    public static void main(String[] args) {
        int anio = 2020, mes = 2,  dias = 0;
        switch (mes){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                dias = 31; break;
            case 2: dias = 28 + bisiesto(anio); break;
            case 4: case 6: case 9: case 11:
                dias = 30; break;
            default: dias = 0;
        }
        System.out.println("El mes " + mes + " tiene " + dias + " días.");
    }

    private static int bisiesto(int anio) {
        int esBisiesto = 0;
        // si el año es múltiplo de 4
        if (anio % 4 == 0) esBisiesto = 1;
        // si el año es múltiplo de 100
        if (anio % 100 == 0) esBisiesto = 0;
        // si el año es múltiplo de 400
        if (anio % 400 == 0) esBisiesto = 1;
        return esBisiesto;
    }
}
