package domain.tendencias;

import domain.catalogo.Cancion;
import domain.helpers.Icono;

public class Normal extends Popularidad {
    private Integer cantReproducciones;

    public void reproducir(Cancion cancion) {
        this.cantReproducciones++;
        if (this.cantReproducciones > 1000){
            cancion.setPopularidad(new EnAuge());
        }
    }
    @Override
     public String leyenda(Cancion cancion){
        String leyenda = cancion.getAlbum().getArtista().getNombre();
        leyenda += " - ";
        leyenda += cancion.getAlbum().getNombre();
        leyenda += " - ";
        leyenda += cancion.getNombre();
        return leyenda;
     }

    @Override
    public String icono() {
        return Icono.MUSICAL_NOTE.texto();
    }
}
