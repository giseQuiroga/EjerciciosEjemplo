package ar.edu.unlam.tallerweb1.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.modelo.Usuario;

@Controller
public class ControladorHolaMundo {

	@RequestMapping("/prueba")
	public ModelAndView HolaMundo() {

		//ModelMap modelo = new ModelMap();
		//Usuario usuario = new Usuario();
		//modelo.put("usuario", usuario);
		return new ModelAndView("prueba");
	}
}
