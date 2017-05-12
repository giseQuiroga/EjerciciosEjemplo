package ar.edu.unlam.tallerweb1.controladores;

import java.util.LinkedList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.modelo.Persona;
import ar.edu.unlam.tallerweb1.servicios.ServicioPersona;


@Controller
public class ControladorPersona {
	
	@Inject
	private ServicioPersona servicioPersona;

	@RequestMapping("/mostrar/nombre")
	public ModelAndView saludoInicial(@RequestParam("nombre") String nombre){//Paso por Url el valor a mostrar en forma de variable=valor
		String mensaje= "Hola "+nombre+"!";
		
		ModelMap model=new ModelMap();
		model.put("mensajeAMostrar",mensaje);
		
		return new ModelAndView("vistaAInvocar",model);
		
	}
	
	@RequestMapping("/mostrar/{nombre}")
	public ModelAndView saludoInicial2(@PathVariable String nombre){ //Arma la url con el valor que se pasa por variable
		String mensaje= "Hola "+nombre+"!";
		
		ModelMap model=new ModelMap();
		model.put("mensajeAMostrar",mensaje);
		
		return new ModelAndView("vistaAInvocar",model);
		
	}
	
	@RequestMapping("mostrar-tabla/{genero}")
	public ModelAndView mostrarTabla(@PathVariable String genero){
		Persona persona= new Persona();
		Persona persona2= new Persona();
		List<Persona> lista = new LinkedList<Persona>();
		List<Persona> personasFiltradas = new LinkedList<Persona>();
		
		persona.setNombre("Pepito");
		persona.setApellido("fomez");
		persona.setDni(12321341);
		persona.setEdad(12);
		persona.setGenero("F");
		
		persona2.setNombre("Pepito");
		persona2.setApellido("fomez");
		persona2.setDni(12321341);
		persona2.setEdad(12);
		persona2.setGenero("M");
		
		lista.add(persona);
		lista.add(persona2);
		
		personasFiltradas.addAll(servicioPersona.filtrarGenero(lista, genero));
		//personasFiltradas = servicioPersona.filtrarGenero(lista, genero);
		
		ModelMap model=new ModelMap();
		model.put("personaList",personasFiltradas);
		return new ModelAndView("vistaAInvocar",model);
	}
	
}
