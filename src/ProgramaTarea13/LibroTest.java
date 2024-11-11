public class LibroTest {
    public static void main(String[] args) {
        Libro libro = new Libro("El principito", "Antoine de Saint-Exupery", 12.50);
        System.out.println("Título: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("Precio: " + libro.getPrecio());
        libro.setPrecio(15.0);
        System.out.println("Nuevo precio: " + libro.getPrecio());
    }
}
