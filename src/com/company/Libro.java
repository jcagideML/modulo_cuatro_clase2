package com.company;

public class Libro {

    private String titulo;
    private long isbn;
    private String autor;

    public Libro() {
    }

    public Libro(String titulo, long isbn, String autor) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
    }

    public void prestamo(){
        System.out.println("El préstamo del libro se realizó con éxito");
    }

    public void devolucion(){
        System.out.println("La devolución del libro se realizó con éxito");
    }

//    @Override // No se puede sobreescribir el método: java: method does not override or implement a method from a supertype
    public String tostring(){
        return getTitulo()+", "+getIsbn()+", "+getAutor();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public static void main(String[] args) {
        Libro lib = new Libro("Harry Potter", 8293472834723453L, "Rowling, J. K.");
        System.out.println(lib);
    }
}
