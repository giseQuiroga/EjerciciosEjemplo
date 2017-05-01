package ar.edu.unlam.tallerweb1.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.modelo.Persona;

@Controller
public class ControladorPersona {

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
	
	@RequestMapping("mostrar-tabla/{registros}")
	public ModelAndView mostrarTabla(@PathVariable Integer registros){
		Persona persona= new Persona();
		persona.nombre="Pepito";
		persona.apellido="Gomez";
		persona.dni=123456789;
		persona.edad=20;
		persona.genero="Masculino";
		ModelMap model=new ModelMap();
		model.put("persona",persona);
		model.put("registros", registros);
		return new ModelAndView("vistaAInvocar",model);
	}
	
}
