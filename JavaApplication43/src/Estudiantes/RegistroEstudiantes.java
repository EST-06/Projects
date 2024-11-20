/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estudiantes;

/**
 *
 * @author Esteban
 */
import java.util.ArrayList;
import java.util.List;

public class RegistroEstudiantes {

    private List<Estudiante> estudiantes;

    public RegistroEstudiantes() {
        estudiantes = new ArrayList<>();

        agregarEstudiantesDeEjemplo();
    }

    private void agregarEstudiantesDeEjemplo() {
        estudiantes.add(new EstudianteBase("juan", "1234", new double[]{4.7, 4.9, 5.0}));
        estudiantes.add(new EstudianteBase("maria", "5678", new double[]{3.5, 4.0, 4.2}));
        estudiantes.add(new EstudianteConBono("pedro", "abcd", new double[]{4.8, 4.9, 5.0}));
        estudiantes.add(new EstudianteBase("ana", "abcd123", new double[]{4.3, 4.6, 4.7}));
        estudiantes.add(new EstudianteConBono("luisa", "xyz", new double[]{5.0, 5.0, 5.0}));
        estudiantes.add(new EstudianteBase("jose", "qwerty", new double[]{3.8, 3.7, 3.9}));
        estudiantes.add(new EstudianteBase("carla", "pass123", new double[]{4.0, 4.1, 4.2}));
        estudiantes.add(new EstudianteConBono("carlos", "password1", new double[]{4.7, 4.9, 5.0}));
        estudiantes.add(new EstudianteBase("lucia", "abc123", new double[]{4.1, 4.3, 4.5}));
        estudiantes.add(new EstudianteConBono("juanita", "password2", new double[]{5.0, 4.8, 4.9}));
        estudiantes.add(new EstudianteBase("jorge", "password3", new double[]{3.5, 3.7, 3.9}));
        estudiantes.add(new EstudianteConBono("esteban", "312", new double[]{4.5, 4.8, 5.0}));
        estudiantes.add(new EstudianteBase("sofia", "qwerty123", new double[]{4.0, 4.2, 4.4}));
    }

    public boolean existeEstudiante(String nombre) {
        return estudiantes.stream().anyMatch(e -> e.getNombre().equalsIgnoreCase(nombre));
    }

    public Estudiante getEstudiante(String nombre) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNombre().equalsIgnoreCase(nombre)) {
                return estudiante;
            }
        }
        return null;
    }
}
