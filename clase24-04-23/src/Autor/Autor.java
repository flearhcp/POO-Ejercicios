package Autor;

public class Autor {
    private String nombre;
    private String goodreads;

    public Autor(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }
    public void setGoodreads(String goodreads) {
        this.goodreads= goodreads;
    }
    public String getGoodreads() {
        return this.goodreads;
    }
}
