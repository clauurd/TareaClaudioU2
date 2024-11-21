package Modelo;

public class Libros {
    private String nombre;
    private String sinopsis;
    private int imagenId;

    //CONSTRUCTOR--------------------------
    public Libros(String nombre, String sinopsis, int imagenId) {
        this.nombre = nombre;
        this.sinopsis = sinopsis;
        this.imagenId = imagenId;
    }
    //GETTERS------------------------------
    public String getNombre() {return nombre;}

    public String getSinopsis() {return sinopsis;}

    public int getImagenId() {return imagenId;}

    //SETTERS-----------------------------
    public void setNombre(String nombre) {this.nombre = nombre;}

    public void setSinopsis(String sinopsis) {this.sinopsis = sinopsis;}

    public void setImagenId(int imagenId) {this.imagenId = imagenId;}
}
