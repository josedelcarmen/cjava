/* Un caracol caminaba distraido y se cae a un pozo, la altura del pozo es H cms, por le día
 S cms y por la noche resbala R cms. ¿En cuántos días sal el caracol del pozo?*/
public class Caracol
{
    public static void main(String[] args) {

        int H = Integer.parseInt(args[0]);
        int S = Integer.parseInt(args[1]);
        int R = Integer.parseInt(args[2]);

        // El caracol cae en el pozo
        int avance = 0, dias = 0;

        // Calculamos el avance del caracol
        // Mientras (avance < H)
        while (avance < H){
            // Contando un día más en el pozo
            dias++; // incrementa le valor de dias en 1
            // En el día sube S cms
            avance = avance + S;
            // Verificando si el caracol ya salió del pozo
            if (avance >= H){
                break; // Termina la repetición
            }
            // En la noche resbala R cms
            avance = avance - R;
        }
        System.out.println("El caracol sale del pozo en " + dias + " días");
    }
}
