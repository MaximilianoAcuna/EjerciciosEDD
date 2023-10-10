package Modelo;

import java.util.Date;

public class Perro {

    private String duenio;
    private String nombreAnimal;
    private String color;
    private Date fechaNacimiento;
    private int edad;

    public Perro(){

    }

    public Perro(String duenio, String nombreAnimal, String color, Date fechaNacimiento, int edad) {
        this.duenio = duenio;
        this.nombreAnimal = nombreAnimal;
        this.color = color;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
    }

    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }

    public String getNombreAnimal() {
        return nombreAnimal;
    }

    public void setNombreAnimal(String nombreAnimal) {
        this.nombreAnimal = nombreAnimal;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "duenio='" + duenio + '\'' +
                ", nombreAnimal='" + nombreAnimal + '\'' +
                ", color='" + color + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", edad=" + edad +
                '}';
    }
}
