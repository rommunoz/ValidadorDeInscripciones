package domain.catalogo;

import domain.tendencias.Normal;
import domain.tendencias.Popularidad;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Setter
@Getter
public class Cancion {
    private String nombre;
    private Integer cantReproducciones;
    private Integer cantLikes;
    private Integer cantDislikes;
    private Album album;

    private Popularidad popularidad;

    private LocalDateTime ultVezReproducida;

    public Cancion(String nombre) {
        this.nombre = nombre;
        this.cantLikes = 0;
        this.cantDislikes = 0;
        this.cantReproducciones = 0;
        this.setPopularidad(new Normal());
    }
    private void reproducir() {
        this.cantReproducciones++;
        this.popularidad.reproducir(this);
        this.ultVezReproducida = LocalDateTime.now();
    }
    public String serReproducida(){
        this.reproducir();
        return this.popularidad.generarDetallePara(this);
    }

    public String getAnio(){
        return this.getAlbum().getAnio().toString();
    }
}
