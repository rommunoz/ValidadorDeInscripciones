package main;

import java.util.List;
public class Materia {
    private List<Materia> correlativas;
    private String nombre;
    public Materia (String nombre, List <Materia> correlativas){
        this.nombre = nombre;
        this.correlativas = correlativas;
    }
    public Boolean puedeSerCursadaPor (Alumno unAlumno){
        return correlativas.stream().allMatch(correlativa -> unAlumno.aprobo(correlativa));
    }
}
