package domain.tendencias;

import domain.catalogo.Cancion;
import domain.helpers.Icono;

import javax.swing.*;

public class EnAuge extends Popularidad {
    private Integer cantReproducciones;
    public void reproducir(Cancion cancion) {
        this.cantReproducciones++;
        if (this.cantReproducciones > 50000 && cancion.getCantLikes() > 20000){
            cancion.setPopularidad(new EnTendencia());
        }
    }

    @Override
    public String leyenda(Cancion cancion) {
        String leyenda = cancion.getAlbum().getArtista().getNombre();
        leyenda += " - ";
        leyenda += cancion.getNombre();
        leyenda += " (";
        leyenda += cancion.getAlbum().getNombre() + " - " + cancion.getAnio();
        leyenda += ")"
        return leyenda;
    }

    @Override
    public String icono() {
        return Icono.FIRE.texto();
    }
}
