package ar.edu.unlam.tallerweb1.servicios;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.modelo.Persona;

@Service("servicioPersona")
@Transactional
public class ServicioPersonaImpl implements ServicioPersona {

	public List<Persona> filtrarGenero(List<Persona> lista, String genero){
		
		List<Persona> personasFiltradas = new LinkedList<Persona>();
		for(Persona cadaPersona:lista){
			if(cadaPersona.genero.equals(genero)){
				personasFiltradas.add(cadaPersona);
			}
		}
		return personasFiltradas;
		
	}
}
