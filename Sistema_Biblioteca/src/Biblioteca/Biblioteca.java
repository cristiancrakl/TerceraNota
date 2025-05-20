package Biblioteca;

import Libro.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {

    private ArrayList<Libro> listaLibros;

    public void iniciarBiblioteca() {
        listaLibros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {

        listaLibros.add(libro);

    }

    public void buscarLibro() {

        try (Scanner sc = new Scanner(System.in);) {

            System.out.println("Ingrese el nombre del libro que desea buscar");
            String nombreLibroBuscar = sc.nextLine();

            for (Libro libro : listaLibros) {

                if (libro.getTitulo().equals(nombreLibroBuscar)) {

                    System.out.println("El libro se encuentra en la biblioteca");
                    return;

                }

            }
            System.out.println("El libro no se encuentra en la biblioteca");

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void mostrarLibros() {

        for (Libro libro : listaLibros) {

            libro.mostrarInformacion();

        }

    }

}
