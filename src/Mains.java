public class Mains {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Laptop", 750.00, 10);
        producto1.mostrarInfo();
        producto1.actualizarStock(5);
        System.out.println("\nInformacion del producto actualizada:");
        producto1.mostrarInfo();
    }
}