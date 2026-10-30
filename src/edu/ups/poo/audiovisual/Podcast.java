package edu.ups.poo.audiovisual;

public class Podcast extends ContenidoAudiovisual {
    
    private String temaPrincipal;
    private int numeroDeEpisodio;
    private String plataforma;

    // Constructor
    public Podcast(String titulo, int duracionEnMinutos, String genero,
            String temaPrincipal, int numeroDeEpisodio, String plataforma) {
 super(titulo, duracionEnMinutos, genero); 
 this.temaPrincipal = temaPrincipal;
 this.numeroDeEpisodio = numeroDeEpisodio;
 this.plataforma = plataforma;
}

    public void compartir() {
        System.out.println("Compartiendo el episodio " + numeroDeEpisodio + 
                           " en " + plataforma + "... ¡Listo!");
    }

    @Override
    public void mostrarDetalles() {
        System.out.println(" Podcast ");
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos() + " min");
        System.out.println("Género: " + getGenero());
        System.out.println("Tema principal: " + temaPrincipal);
        System.out.println("Número de episodio: " + numeroDeEpisodio);
        System.out.println("Plataforma: " + plataforma);
    }

    // Getters y Setters
    public String getTemaPrincipal() { return temaPrincipal; }
    public void setTemaPrincipal(String tema) { this.temaPrincipal = tema; }
    public int getNumeroDeEpisodio() { return numeroDeEpisodio; }
    public void setNumeroDeEpisodio(int numero) { this.numeroDeEpisodio = numero; }
    public String getPlataforma() { return plataforma; }
    public void setPlataforma(String plataforma) { this.plataforma = plataforma; }
}