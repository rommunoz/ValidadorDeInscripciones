package main;

import java.util.List;
public class Inscripcion {
    private List<Materia> materiasAInscribir;
    private Alumno alumno;
    public Inscripcion(Alumno alumno, List<Materia> materias) {
        this.alumno = alumno;
        this.materiasAInscribir = materias;
    }
    public Boolean aprobada(){
        return materiasAInscribir.stream().allMatch(materia -> materia.puedeSerCursadaPor(alumno));
    }
}
