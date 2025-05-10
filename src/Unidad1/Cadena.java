public class Cadena {

    public static void modificarCadena(String texto) {
        texto = texto + " modificado";
        System.out.println("Dentro del método: " + texto);
    }

    public static void main(String[] args) {
        String miTexto = "Hola";

        System.out.println("Antes de llamar al método: " + miTexto);

        modificarCadena(miTexto);

        System.out.println("Después de llamar al método: " + miTexto);
    }
}
