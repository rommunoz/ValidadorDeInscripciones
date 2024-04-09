package domain.catalogo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Album {
    private String nombre;
    private Integer anio;
    private Artista artista;
}
