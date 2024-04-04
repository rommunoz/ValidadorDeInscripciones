package main;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class InscripcionTest {
    private List<Materia> sinCorrelativas = new ArrayList<>();
    private List<Materia> correlativasADS = new ArrayList<>();
    private List<Materia> correlativasDDS = new ArrayList<>();
    private Materia sYO = new Materia("SYO", sinCorrelativas);
    private Materia aDS = new Materia("ADS", correlativasADS);
    private Materia dDS = new Materia("DDS", correlativasDDS);

    @BeforeEach
    void setUp(){
        correlativasADS.add(sYO);
        correlativasDDS.add(sYO);
        correlativasDDS.add(aDS);
    }
    @Test
    void testAprobada(){
        List<Materia> materiasAprobadasXRoman = new ArrayList<>();
        List<Materia> materiasParaRoman = new ArrayList<>();
        materiasAprobadasXRoman.add(sYO);
        materiasAprobadasXRoman.add(aDS);
        materiasParaRoman.add(dDS);

        Alumno roman = new Alumno("2097291", materiasAprobadasXRoman);
        Inscripcion inscripcionAceptable = new Inscripcion(roman, materiasParaRoman);

        assert(inscripcionAceptable.aprobada());
    }
    @Test
    void testRechazada(){
        List<Materia> materiasAprobadasXEquis = new ArrayList<>();
        List<Materia> materiasParaEquis = new ArrayList<>();
        materiasParaEquis.add(dDS);

        Alumno equis = new Alumno("2107291", materiasAprobadasXEquis);
        Inscripcion inscripcionNoViable = new Inscripcion(equis, materiasParaEquis);

        assertFalse(inscripcionNoViable.aprobada());
    }
}