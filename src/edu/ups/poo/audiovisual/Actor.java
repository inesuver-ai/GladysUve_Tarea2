package edu.ups.poo.audiovisual;

public class Actor {
    private String nombre;
    private String nacionalidad;
    private int anioNacimiento;

    public Actor(String nombre, String nacionalidad, int anioNacimiento) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.anioNacimiento = anioNacimiento;
    }

    public String getNombre() { return nombre; }
}