public class RectanguloTest {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(5.0, 3.0);
        System.out.println("Ancho del rectangulo: " + rectangulo.getAncho());
        System.out.println("Alto del rectangulo: " + rectangulo.getAlto());
        System.out.println("Area del rectangulo: " + rectangulo.calcularArea());
        System.out.println("Perimetro del rectangulo: " + rectangulo.calcularPerimetro());
    }
}
