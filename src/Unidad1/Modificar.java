class Modificar {
    int ancho;
    int alto;

    public Rectangulo(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public String toString() {
        return "Rectangulo [ancho=" + ancho + ", alto=" + alto + "]";
    }
}

public class Ejercicio2 {

    public static void modificarRectangulo(Rectangulo r) {
        r.ancho = 20;
        r.alto = 15;
        System.out.println("Dentro del método: " + r);
    }

    public static void main(String[] args) {
        Rectangulo miRect = new Rectangulo(5, 10);
        System.out.println("Antes de modificar: " + miRect);

        modificarRectangulo(miRect);

        System.out.println("Después de modificar: " + miRect);
    }
}
