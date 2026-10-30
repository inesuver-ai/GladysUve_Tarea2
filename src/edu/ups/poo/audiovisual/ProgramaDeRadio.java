package edu.ups.poo.audiovisual;

public class ProgramaDeRadio extends ContenidoAudiovisual {
    
    private String locutor;
    private String frecuencia;
    private boolean enVivo;

    // Constructor
    public ProgramaDeRadio(String titulo, int duracionEnMinutos, String genero,
            String locutor, String frecuencia, boolean enVivo) {
super(titulo, duracionEnMinutos, genero); 
this.locutor = locutor;
this.frecuencia = frecuencia;
this.enVivo = enVivo;
}
    public void emitirEnVivo() {
        this.enVivo = true;
        System.out.println("El programa '" + getTitulo() + "' está en transmisión en vivo.");
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("=== Programa de Radio ===");
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos() + " min");
        System.out.println("Género: " + getGenero());
        System.out.println("Locutor: " + locutor);
        System.out.println("Frecuencia: " + frecuencia);
        System.out.println("¿En vivo?: " + (enVivo ? "Sí " : "No "));
    }

    // Getters y Setters
    public String getLocutor() { return locutor; }
    public void setLocutor(String locutor) { this.locutor = locutor; }
    public String getFrecuencia() { return frecuencia; }
    public void setFrecuencia(String frecuencia) { this.frecuencia = frecuencia; }
    public boolean isEnVivo() { return enVivo; }
    public void setEnVivo(boolean enVivo) { this.enVivo = enVivo; }
}