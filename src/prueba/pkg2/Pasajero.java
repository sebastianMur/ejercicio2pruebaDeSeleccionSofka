package prueba.pkg2;


public class Pasajero {
   private String cedula, nombre;

    public Pasajero(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public Pasajero() {
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
   
}
