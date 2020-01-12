package prueba.pkg2;

public class Avion {
    private String serial;
    private int capacidad;

    public Avion() {
    }

    public Avion(String serial, int capacidad) {
        this.serial = serial;
        this.capacidad = capacidad;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
}
