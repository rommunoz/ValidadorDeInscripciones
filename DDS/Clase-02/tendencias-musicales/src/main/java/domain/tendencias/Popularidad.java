package domain.tendencias;

import domain.catalogo.Cancion;

public abstract class Popularidad {
    public abstract void reproducir(Cancion cancion);
    public String generarDetallePara(Cancion cancion){
        String detalle = "";
        detalle = this.icono();
        detalle += " ";
        detalle += this.leyenda(cancion);
        return detalle;
    }
    public abstract String leyenda(Cancion cancion);

    public abstract String icono();
}
