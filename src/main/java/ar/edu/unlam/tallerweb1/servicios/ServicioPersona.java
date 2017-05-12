package ar.edu.unlam.tallerweb1.servicios;

import java.util.List;

import ar.edu.unlam.tallerweb1.modelo.Persona;

public interface ServicioPersona {

	List<Persona> filtrarGenero(List<Persona> lista, String genero);
}
