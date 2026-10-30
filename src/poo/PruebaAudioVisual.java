package poo;

import edu.ups.poo.audiovisual.*;

public class PruebaAudioVisual {
    public static void main(String[] args) {

        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[5];

        // 1. Película → (título, duración, género, director)
        contenidos[0] = new Pelicula("Avatar", 125, "Acción", "20th Century Studios");

        // 2. Serie de TV → (título, duración, género, productor)
        contenidos[1] = new SerieDeTV("Game of Thrones", 60, "Fantasía", "HBO");

        // 3. Documental → (título, duración, género, tema)
        contenidos[2] = new Documental("Cosmos", 45, "Divulgación", "Astronomía");

        // 4. Podcast → (título, duración, género, tema, n.º episodio, plataforma)
        contenidos[3] = new Podcast("La Ciencia de Hoy", 30, "Educativo", "Universo", 15, "Spotify");

        // 5. Programa de Radio → (título, duración, género, locutor, frecuencia, enVivo)
        contenidos[4] = new ProgramaDeRadio("Noticias al Día", 20, "Informativo", "Carlos Pérez", "98.5 FM", true);

        // Mostrar todos los contenidos
        System.out.println("\n LISTA DE CONTENIDOS ");
        for (ContenidoAudiovisual c : contenidos) {
            c.mostrarDetalles();
            System.out.println();
        }
    }
}