/**
 * Class SerieDeTV
 */
package edu.ups.poo.audiovisual;

import java.util.ArrayList;
import java.util.List;

public class SerieDeTV extends ContenidoAudiovisual {
    private String productor;
    private List<Temporada> temporadas;

    public SerieDeTV(String titulo, int duracionEnMinutos, String genero, String productor) {
        super(titulo, duracionEnMinutos, genero);
        this.productor = productor;
        this.temporadas = new ArrayList<>();
    }

    public void agregarTemporada(int numero, int episodios) {
        temporadas.add(new Temporada(numero, episodios));
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("=== Serie de TV ===");
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración por episodio: " + getDuracionEnMinutos() + " min");
        System.out.println("Género: " + getGenero());
        System.out.println("Productor: " + productor);
        System.out.println("Temporadas: " + temporadas.size());
    }
}