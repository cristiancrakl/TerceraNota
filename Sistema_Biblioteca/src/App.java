import Biblioteca.Biblioteca;
import Libro.Novela;

public class App {
    public static void main(String[] args) {

        Novela novela1 = new Novela("elperro", "cristian morales", 2009, "ciencia y ficcion");
        Novela novela2 = new Novela("LaVenganza", "cristian morales", 2009, "ciencia y ficcion");

        Biblioteca bt = new Biblioteca();

        bt.iniciarBiblioteca();
        bt.agregarLibro(novela1);
        bt.agregarLibro(novela2);
        bt.mostrarLibros();

        bt.buscarLibro();

    }
}
