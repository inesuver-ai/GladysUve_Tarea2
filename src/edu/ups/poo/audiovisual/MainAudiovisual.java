package edu.ups.poo.audiovisual;

public class MainAudiovisual {
    public static void main(String[] args) {
        
        // 1. PELÍCULA con Actores
        System.out.println("PELÍCULA");
        
        Pelicula pelicula = new Pelicula(
            "El Origen", 
            148, 
            "Ciencia Ficción", 
            "Christopher Nolan"
        );
        Actor actor1 = new Actor("Leonardo DiCaprio", "Estadounidense", 1974);
        Actor actor2 = new Actor("Joseph Gordon-Levitt", "Estadounidense", 1981);
        pelicula.agregarActor(actor1);
        pelicula.agregarActor(actor2);
        pelicula.mostrarDetalles();
        System.out.println();

        // 2. SERIE DE TV con Temporadas
        System.out.println("SERIE DE TV");
        
        SerieDeTV serie = new SerieDeTV(
            "Stranger Things", 
            50, 
            "Ciencia Ficción", 
            "Duffer Bros"
        );
        serie.agregarTemporada(1, 8);
        serie.agregarTemporada(2, 9);
        serie.agregarTemporada(3, 8);
        serie.mostrarDetalles();
        System.out.println();

        // 3. DOCUMENTAL con Investigadores
        System.out.println("DOCUMENTAL");
        
        Documental doc = new Documental(
            "El Cambio Climático", 
            60, 
            "Educativo", 
            "Medio Ambiente"
        );
        Investigador inv1 = new Investigador("María López", "Climatología", "Universidad Nacional");
        Investigador inv2 = new Investigador("Carlos Ruiz", "Ecología", "Instituto de Ciencias");
        doc.agregarInvestigador(inv1);
        doc.agregarInvestigador(inv2);
        doc.mostrarDetalles();
        System.out.println();

        // 4. PODCAST
        System.out.println("PODCAST");
        
        Podcast episodio = new Podcast(
            "Mentes Curiosas", 
            35, 
            "Educativo",
            "Los secretos del universo",
            47,
            "Spotify"
        );
        episodio.compartir();
        episodio.mostrarDetalles();
        System.out.println();

        // 5. PROGRAMA DE RADIO
        System.out.println("PROGRAMA DE RADIO");
        
        ProgramaDeRadio programa = new ProgramaDeRadio(
            "La Hora Cultural",
            60,
            "Cultura",
            "Ana Vásquez",
            "92.5 FM",
            false
        );
        programa.emitirEnVivo();
        programa.mostrarDetalles();
        
        System.out.println("\n ¡Todo funcionando correctamente!");
    }
}