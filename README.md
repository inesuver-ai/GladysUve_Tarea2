 🎬Contenido Audiovisual

Proyecto desarrollado en **Java** aplicando los principios de **Programación Orientada a Objetos (POO)**, como parte de la asignatura de Programación — Unidad 2.

---

 📖 Descripción del Proyecto
Este sistema permite gestionar distintos tipos de contenido audiovisual mediante una estructura basada en **herencia, clases abstractas, agregación, composición y asociación**. Se diseñó para ser escalable, claro y fácil de mantener.

---

 📁 Estructura del Proyecto
src/
└── edu/ups/poo/audiovisual/
├── ContenidoAudiovisual.java   # Clase abstracta base
├── Pelicula.java               # Subclase → tiene Actores (Agregación)
├── SerieDeTV.java              # Subclase → tiene Temporadas (Composición)
├── Documental.java             # Subclase → tiene Investigadores (Asociación)
├── Podcast.java                # NUEVA Subclase
├── ProgramaDeRadio.java        # NUEVA Subclase
├── Actor.java
├── Temporada.java
├── Investigador.java
└── PruebaAudioVisual.java      # Clase de ejecución


 🏗️ Arquitectura y Conceptos Aplicados

 1. Herencia

ContenidoAudiovisual (abstracta)
├── Película
├── SerieDeTV
├── Documental
├── Podcast ✨ NUEVO
└── ProgramaDeRadio ✨ NUEVO

- La clase base define atributos comunes: `titulo`, `duracionEnMinutos`, `genero`
- Declara el método abstracto `mostrarDetalles()` que **todas las subclases implementan**

 2. Relaciones entre Clases

| Relación | Clases | Descripción |
| **Agregación** | Película ↔ Actor | El actor puede existir sin la película. Relación débil (`0..*`) |
| **Composición** | SerieDeTV ↔ Temporada | La temporada nace y muere con la serie. Relación fuerte (`1..*`) |
| **Asociación** | Documental ↔ Investigador | El investigador puede participar en varios documentales. Independencia mutua |

 3. Encapsulamiento
- Todos los atributos son `private`
- Se accede mediante métodos `getter` y `setter`


 ✨ Nuevas Subclases Agregadas
 🎙️ `Podcast`
- **Atributos propios:** temaPrincipal, numeroDeEpisodio, plataforma
- **Método propio:** `compartir()` — muestra mensaje de difusión
- **Uso:** Almacena episodios de audios educativos o de entretenimiento

 📻 `ProgramaDeRadio`
- **Atributos propios:** locutor, frecuencia, enVivo
- **Método propio:** `emitirEnVivo()` — cambia el estado de transmisión
- **Uso:** Representa emisiones radiales con indicador de transmisión en vivo


🚀 Cómo Ejecutar el Proyecto

 Pasos
1. Importar el proyecto en el IDE
2. Verificar que todas las clases estén en el paquete:
3. Ejecutar la clase principal:
> `PruebaAudioVisual.java` → clic derecho → **Run As → Java Application**

 Salida Esperada
El programa mostrará en consola los detalles de:
- ✅ Una película con sus actores
- ✅ Una serie con sus temporadas
- ✅ Un documental con sus investigadores
- ✅ Un podcast con su número de episodio y plataforma
- ✅ Un programa de radio con su estado de transmisión


📊 Diagrama de Clases
▲
┌─────────────┼─────────────┬─────────────┐
│ │ │ │
Película SerieDeTV Documental Podcast / ProgramaDeRadio
│ │ │
Agregación Composición Asociación
│ │ │
Actor Temporada Investigador


 ✅ Estado del Proyecto
- [x] Clase base abstracta
- [x] Subclases originales implementadas
- [x] Relaciones: agregación, composición, asociación
- [x] Nuevas subclases: Podcast y ProgramaDeRadio
- [x] Código de prueba funcional
- [x] Documentación completa
