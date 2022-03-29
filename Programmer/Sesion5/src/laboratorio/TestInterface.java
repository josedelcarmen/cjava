package laboratorio;

public class TestInterface {
    public static void main (String[] args) {
        Globo zepelin = new Globo();
        zepelin.setDireccion('N');
        zepelin.girarDerecha(90);
        System.out.println(zepelin.getDireccion());

        Patin patin = new Patin();
        patin.girarDerecha(45);
    }
}
