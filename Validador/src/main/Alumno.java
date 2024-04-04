package main;

import java.util.List;
public class Alumno {
    private List<Materia> aprobadas;
    private String legajo;
    public Alumno (String unLegajo, List<Materia> aprobadas){
        this.legajo = unLegajo;
        this.aprobadas = aprobadas;
    }
    public Boolean aprobo(Materia unaMateria) {
        return aprobadas.contains(unaMateria);
    }
}
