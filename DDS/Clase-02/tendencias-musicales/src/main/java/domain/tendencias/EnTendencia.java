package domain.tendencias;

import domain.catalogo.Cancion;
import domain.helpers.Icono;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class EnTendencia extends Popularidad {
    private Integer cantReproducciones;
    public void reproducir(Cancion cancion) {
        this.cantReproducciones++;
        if (! this.seEscuchaFrecuente(cancion)){
            cancion.setPopularidad(new Normal());
        }
    }

    @Override
    public String leyenda(Cancion cancion) {
        String leyenda = cancion.getNombre();
        leyenda += " - ";
        leyenda += cancion.getAlbum().getArtista().getNombre();
        leyenda += " (";
        leyenda += cancion.getAlbum().getNombre() + "-" + cancion.getAnio();
        leyenda += ")";
        return leyenda;
    }

    @Override
    public String icono() {
        return Icono.FIRE.texto();
    }

    private boolean seEscuchaFrecuente(Cancion cancion){
        LocalDateTime ahora = LocalDateTime.now();
        long diferencia = ChronoUnit.HOURS.between(ahora, cancion.getUltVezReproducida());
        return diferencia < 24;
    }
}
